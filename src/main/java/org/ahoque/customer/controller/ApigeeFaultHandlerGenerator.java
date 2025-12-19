import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Generates Apigee fault handling files from OpenAPI specifications
 */
public class ApigeeFaultHandlerGenerator {
    
    private final ObjectMapper yamlMapper;
    private final ObjectMapper jsonMapper;
    private final String outputDirectory;
    
    public ApigeeFaultHandlerGenerator(String outputDirectory) {
        this.yamlMapper = new ObjectMapper(new YAMLFactory());
        this.jsonMapper = new ObjectMapper();
        this.outputDirectory = outputDirectory;
    }
    
    /**
     * Generate fault handling files from OpenAPI spec
     */
    public void generateFaultHandlers(String openApiFilePath) throws IOException {
        JsonNode openApiSpec = parseOpenApiSpec(openApiFilePath);
        
        // Create output directories
        createDirectories();
        
        // Extract mandatory headers from OpenAPI spec
        Set<String> mandatoryHeaders = extractMandatoryHeaders(openApiSpec);
        
        // Generate fault handling policies
        generateRaiseFaultPolicy();
        generateAssignMessagePolicy();
        generateHeaderValidationPolicies(mandatoryHeaders);
        generateFaultRulesXml(openApiSpec);
        generateDefaultFaultRuleXml();
        
        System.out.println("Fault handling files generated successfully in: " + outputDirectory);
        if (!mandatoryHeaders.isEmpty()) {
            System.out.println("Mandatory headers detected: " + mandatoryHeaders);
        }
    }
    
    private JsonNode parseOpenApiSpec(String filePath) throws IOException {
        File file = new File(filePath);
        if (filePath.endsWith(".yaml") || filePath.endsWith(".yml")) {
            return yamlMapper.readTree(file);
        } else {
            return jsonMapper.readTree(file);
        }
    }
    
    private void createDirectories() throws IOException {
        Files.createDirectories(Paths.get(outputDirectory, "policies"));
        Files.createDirectories(Paths.get(outputDirectory, "proxies"));
    }
    
    /**
     * Extract mandatory headers from OpenAPI specification
     */
    private Set<String> extractMandatoryHeaders(JsonNode openApiSpec) {
        Set<String> mandatoryHeaders = new LinkedHashSet<>();
        
        // Check global security requirements
        if (openApiSpec.has("security")) {
            JsonNode security = openApiSpec.get("security");
            if (security.isArray()) {
                for (JsonNode secItem : security) {
                    secItem.fieldNames().forEachRemaining(mandatoryHeaders::add);
                }
            }
        }
        
        // Check components/parameters for required headers
        if (openApiSpec.has("components") && openApiSpec.get("components").has("parameters")) {
            JsonNode parameters = openApiSpec.get("components").get("parameters");
            parameters.fields().forEachRemaining(entry -> {
                JsonNode param = entry.getValue();
                if (param.has("in") && "header".equals(param.get("in").asText()) &&
                    param.has("required") && param.get("required").asBoolean()) {
                    mandatoryHeaders.add(param.get("name").asText());
                }
            });
        }
        
        // Check paths for required header parameters
        if (openApiSpec.has("paths")) {
            JsonNode paths = openApiSpec.get("paths");
            paths.fields().forEachRemaining(pathEntry -> {
                JsonNode pathItem = pathEntry.getValue();
                pathItem.fields().forEachRemaining(methodEntry -> {
                    if (methodEntry.getValue().has("parameters")) {
                        JsonNode parameters = methodEntry.getValue().get("parameters");
                        if (parameters.isArray()) {
                            for (JsonNode param : parameters) {
                                if (param.has("in") && "header".equals(param.get("in").asText()) &&
                                    param.has("required") && param.get("required").asBoolean() &&
                                    param.has("name")) {
                                    mandatoryHeaders.add(param.get("name").asText());
                                }
                            }
                        }
                    }
                });
            });
        }
        
        return mandatoryHeaders;
    }
    
    /**
     * Generate header validation policies
     */
    private void generateHeaderValidationPolicies(Set<String> mandatoryHeaders) throws IOException {
        if (mandatoryHeaders.isEmpty()) {
            // Generate a generic header validation policy
            generateGenericHeaderValidationPolicy();
        } else {
            // Generate specific validation policy for detected headers
            generateSpecificHeaderValidationPolicy(mandatoryHeaders);
        }
        
        // Generate missing header fault policy
        generateMissingHeaderFaultPolicy();
    }
    
    /**
     * Generate generic header validation policy template
     */
    private void generateGenericHeaderValidationPolicy() throws IOException {
        String xml = 
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<Javascript name=\"JS-ValidateHeaders\" timeLimit=\"200\">\n" +
            "    <DisplayName>Validate Required Headers</DisplayName>\n" +
            "    <ResourceURL>jsc://validate-headers.js</ResourceURL>\n" +
            "</Javascript>";
        
        writeFile(Paths.get(outputDirectory, "policies", "JS-ValidateHeaders.xml"), xml);
        
        // Generate JavaScript resource
        String js = 
            "// Validate Required Headers\n" +
            "// Configure required headers below\n" +
            "var requiredHeaders = [\n" +
            "    'Authorization',\n" +
            "    'Content-Type',\n" +
            "    'X-API-Key'\n" +
            "    // Add more headers as needed\n" +
            "];\n\n" +
            "var missingHeaders = [];\n\n" +
            "for (var i = 0; i < requiredHeaders.length; i++) {\n" +
            "    var headerName = requiredHeaders[i];\n" +
            "    var headerValue = context.getVariable('request.header.' + headerName.toLowerCase());\n" +
            "    \n" +
            "    if (!headerValue || headerValue === '') {\n" +
            "        missingHeaders.push(headerName);\n" +
            "    }\n" +
            "}\n\n" +
            "if (missingHeaders.length > 0) {\n" +
            "    context.setVariable('missingHeaders', missingHeaders.join(', '));\n" +
            "    context.setVariable('headerValidationFailed', 'true');\n" +
            "} else {\n" +
            "    context.setVariable('headerValidationFailed', 'false');\n" +
            "}";
        
        Files.createDirectories(Paths.get(outputDirectory, "resources", "jsc"));
        writeFile(Paths.get(outputDirectory, "resources", "jsc", "validate-headers.js"), js);
    }
    
    /**
     * Generate specific header validation policy based on OpenAPI spec
     */
    private void generateSpecificHeaderValidationPolicy(Set<String> mandatoryHeaders) throws IOException {
        StringBuilder conditions = new StringBuilder();
        
        for (String header : mandatoryHeaders) {
            String headerVar = header.toLowerCase().replace("-", ".");
            if (conditions.length() > 0) {
                conditions.append(" or ");
            }
            conditions.append("(request.header.").append(header.toLowerCase())
                     .append(" = null or request.header.").append(header.toLowerCase())
                     .append(" = \"\")");
        }
        
        String xml = String.format(
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<Javascript name=\"JS-ValidateHeaders\" timeLimit=\"200\">\n" +
            "    <DisplayName>Validate Required Headers</DisplayName>\n" +
            "    <ResourceURL>jsc://validate-headers.js</ResourceURL>\n" +
            "</Javascript>");
        
        writeFile(Paths.get(outputDirectory, "policies", "JS-ValidateHeaders.xml"), xml);
        
        // Generate JavaScript resource with specific headers
        StringBuilder js = new StringBuilder();
        js.append("// Validate Required Headers - Auto-generated from OpenAPI spec\n");
        js.append("var requiredHeaders = [\n");
        
        int count = 0;
        for (String header : mandatoryHeaders) {
            if (count > 0) js.append(",\n");
            js.append("    '").append(header).append("'");
            count++;
        }
        
        js.append("\n];\n\n");
        js.append("var missingHeaders = [];\n\n");
        js.append("for (var i = 0; i < requiredHeaders.length; i++) {\n");
        js.append("    var headerName = requiredHeaders[i];\n");
        js.append("    var headerValue = context.getVariable('request.header.' + headerName.toLowerCase());\n");
        js.append("    \n");
        js.append("    if (!headerValue || headerValue === '') {\n");
        js.append("        missingHeaders.push(headerName);\n");
        js.append("    }\n");
        js.append("}\n\n");
        js.append("if (missingHeaders.length > 0) {\n");
        js.append("    context.setVariable('missingHeaders', missingHeaders.join(', '));\n");
        js.append("    context.setVariable('headerValidationFailed', 'true');\n");
        js.append("} else {\n");
        js.append("    context.setVariable('headerValidationFailed', 'false');\n");
        js.append("}");
        
        Files.createDirectories(Paths.get(outputDirectory, "resources", "jsc"));
        writeFile(Paths.get(outputDirectory, "resources", "jsc", "validate-headers.js"), js.toString());
    }
    
    /**
     * Generate fault policy for missing headers
     */
    private void generateMissingHeaderFaultPolicy() throws IOException {
        String xml = 
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<RaiseFault name=\"RF-MissingRequiredHeaders\">\n" +
            "    <DisplayName>Raise Fault - Missing Required Headers</DisplayName>\n" +
            "    <FaultResponse>\n" +
            "        <Set>\n" +
            "            <StatusCode>400</StatusCode>\n" +
            "            <ReasonPhrase>Bad Request</ReasonPhrase>\n" +
            "        </Set>\n" +
            "        <AssignMessage>\n" +
            "            <Set>\n" +
            "                <Headers>\n" +
            "                    <Header name=\"Content-Type\">application/json</Header>\n" +
            "                    <Header name=\"X-Error-Code\">400</Header>\n" +
            "                    <Header name=\"X-Request-Id\">{messageid}</Header>\n" +
            "                    <Header name=\"Cache-Control\">no-cache, no-store, must-revalidate</Header>\n" +
            "                </Headers>\n" +
            "                <Payload contentType=\"application/json\">\n" +
            "                    {\n" +
            "                        \"error\": {\n" +
            "                            \"code\": \"400\",\n" +
            "                            \"message\": \"Missing required headers: {missingHeaders}\",\n" +
            "                            \"timestamp\": \"{system.timestamp}\",\n" +
            "                            \"path\": \"{proxy.pathsuffix}\",\n" +
            "                            \"requestId\": \"{messageid}\",\n" +
            "                            \"details\": \"Required headers must be provided in the request\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                </Payload>\n" +
            "            </Set>\n" +
            "        </AssignMessage>\n" +
            "    </FaultResponse>\n" +
            "    <IgnoreUnresolvedVariables>true</IgnoreUnresolvedVariables>\n" +
            "</RaiseFault>";
        
        writeFile(Paths.get(outputDirectory, "policies", "RF-MissingRequiredHeaders.xml"), xml);
    }
    
    /**
     * Generate RaiseFault policy for different error scenarios
     */
    private void generateRaiseFaultPolicy() throws IOException {
        Map<String, FaultConfig> faults = new HashMap<>();
        
        faults.put("NotFound", new FaultConfig("404", "Not Found", "The requested resource was not found"));
        faults.put("BadRequest", new FaultConfig("400", "Bad Request", "Invalid request parameters"));
        faults.put("Unauthorized", new FaultConfig("401", "Unauthorized", "Authentication required"));
        faults.put("Forbidden", new FaultConfig("403", "Forbidden", "Access denied"));
        faults.put("MethodNotAllowed", new FaultConfig("405", "Method Not Allowed", "HTTP method not allowed"));
        faults.put("InternalError", new FaultConfig("500", "Internal Server Error", "An internal error occurred"));
        faults.put("ServiceUnavailable", new FaultConfig("503", "Service Unavailable", "Service temporarily unavailable"));
        faults.put("GatewayTimeout", new FaultConfig("504", "Gateway Timeout", "Backend service timeout"));
        
        for (Map.Entry<String, FaultConfig> entry : faults.entrySet()) {
            generateRaiseFaultPolicyFile(entry.getKey(), entry.getValue());
        }
    }
    
    private void generateRaiseFaultPolicyFile(String name, FaultConfig config) throws IOException {
        String xml = String.format(
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<RaiseFault name=\"RF-%s\">\n" +
            "    <DisplayName>Raise Fault - %s</DisplayName>\n" +
            "    <FaultResponse>\n" +
            "        <Set>\n" +
            "            <StatusCode>%s</StatusCode>\n" +
            "            <ReasonPhrase>%s</ReasonPhrase>\n" +
            "        </Set>\n" +
            "        <AssignMessage>\n" +
            "            <Set>\n" +
            "                <Headers>\n" +
            "                    <Header name=\"Content-Type\">application/json</Header>\n" +
            "                    <Header name=\"X-Error-Code\">%s</Header>\n" +
            "                    <Header name=\"X-Request-Id\">{messageid}</Header>\n" +
            "                    <Header name=\"Cache-Control\">no-cache, no-store, must-revalidate</Header>\n" +
            "                </Headers>\n" +
            "                <Payload contentType=\"application/json\">\n" +
            "                    {\n" +
            "                        \"error\": {\n" +
            "                            \"code\": \"%s\",\n" +
            "                            \"message\": \"%s\",\n" +
            "                            \"timestamp\": \"{system.timestamp}\",\n" +
            "                            \"path\": \"{proxy.pathsuffix}\",\n" +
            "                            \"requestId\": \"{messageid}\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                </Payload>\n" +
            "            </Set>\n" +
            "        </AssignMessage>\n" +
            "    </FaultResponse>\n" +
            "    <IgnoreUnresolvedVariables>true</IgnoreUnresolvedVariables>\n" +
            "</RaiseFault>",
            name, name, config.statusCode, config.reasonPhrase, config.statusCode, config.statusCode, config.message
        );
        
        writeFile(Paths.get(outputDirectory, "policies", "RF-" + name + ".xml"), xml);
    }
    
    /**
     * Generate AssignMessage policy for error formatting
     */
    private void generateAssignMessagePolicy() throws IOException {
        String xml = 
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<AssignMessage name=\"AM-FormatErrorResponse\">\n" +
            "    <DisplayName>Format Error Response</DisplayName>\n" +
            "    <Set>\n" +
            "        <Headers>\n" +
            "            <Header name=\"Content-Type\">application/json</Header>\n" +
            "            <Header name=\"X-Error-Code\">{error.status.code}</Header>\n" +
            "            <Header name=\"X-Request-Id\">{messageid}</Header>\n" +
            "            <Header name=\"X-Fault-Name\">{fault.name}</Header>\n" +
            "            <Header name=\"Cache-Control\">no-cache, no-store, must-revalidate</Header>\n" +
            "        </Headers>\n" +
            "        <Payload contentType=\"application/json\">\n" +
            "            {\n" +
            "                \"error\": {\n" +
            "                    \"code\": \"{error.status.code}\",\n" +
            "                    \"message\": \"{error.message}\",\n" +
            "                    \"timestamp\": \"{system.timestamp}\",\n" +
            "                    \"path\": \"{proxy.pathsuffix}\",\n" +
            "                    \"requestId\": \"{messageid}\",\n" +
            "                    \"details\": \"{fault.name}\"\n" +
            "                }\n" +
            "            }\n" +
            "        </Payload>\n" +
            "    </Set>\n" +
            "    <IgnoreUnresolvedVariables>true</IgnoreUnresolvedVariables>\n" +
            "    <AssignTo createNew=\"false\" transport=\"http\" type=\"response\"/>\n" +
            "</AssignMessage>";
        
        writeFile(Paths.get(outputDirectory, "policies", "AM-FormatErrorResponse.xml"), xml);
    }
    
    /**
     * Generate FaultRules section for proxy endpoint
     */
    private void generateFaultRulesXml(JsonNode openApiSpec) throws IOException {
        StringBuilder xml = new StringBuilder();
        xml.append("<!-- FaultRules to be added to ProxyEndpoint -->\n");
        xml.append("<FaultRules>\n");
        
        // Add fault rules based on common scenarios
        xml.append("    <FaultRule name=\"InvalidApiKey\">\n");
        xml.append("        <Step>\n");
        xml.append("            <Name>RF-Unauthorized</Name>\n");
        xml.append("        </Step>\n");
        xml.append("        <Condition>(fault.name Matches \"InvalidApiKey*\")</Condition>\n");
        xml.append("    </FaultRule>\n\n");
        
        xml.append("    <FaultRule name=\"QuotaViolation\">\n");
        xml.append("        <Step>\n");
        xml.append("            <Name>RF-ServiceUnavailable</Name>\n");
        xml.append("        </Step>\n");
        xml.append("        <Condition>(fault.name = \"QuotaViolation\")</Condition>\n");
        xml.append("    </FaultRule>\n\n");
        
        xml.append("    <FaultRule name=\"SpikeArrestViolation\">\n");
        xml.append("        <Step>\n");
        xml.append("            <Name>RF-ServiceUnavailable</Name>\n");
        xml.append("        </Step>\n");
        xml.append("        <Condition>(fault.name = \"SpikeArrestViolation\")</Condition>\n");
        xml.append("    </FaultRule>\n\n");
        
        xml.append("    <FaultRule name=\"TargetConnectError\">\n");
        xml.append("        <Step>\n");
        xml.append("            <Name>RF-ServiceUnavailable</Name>\n");
        xml.append("        </Step>\n");
        xml.append("        <Condition>(fault.name Matches \"*Connect*\")</Condition>\n");
        xml.append("    </FaultRule>\n\n");
        
        xml.append("    <FaultRule name=\"Timeout\">\n");
        xml.append("        <Step>\n");
        xml.append("            <Name>RF-GatewayTimeout</Name>\n");
        xml.append("        </Step>\n");
        xml.append("        <Condition>(fault.name Matches \"*Timeout*\")</Condition>\n");
        xml.append("    </FaultRule>\n");
        
        xml.append("</FaultRules>");
        
        writeFile(Paths.get(outputDirectory, "proxies", "FaultRules.xml"), xml.toString());
    }
    
    /**
     * Generate DefaultFaultRule for unhandled errors
     */
    private void generateDefaultFaultRuleXml() throws IOException {
        String xml = 
            "<!-- DefaultFaultRule to be added to ProxyEndpoint -->\n" +
            "<DefaultFaultRule>\n" +
            "    <Step>\n" +
            "        <Name>AM-FormatErrorResponse</Name>\n" +
            "    </Step>\n" +
            "    <AlwaysEnforce>true</AlwaysEnforce>\n" +
            "</DefaultFaultRule>";
        
        writeFile(Paths.get(outputDirectory, "proxies", "DefaultFaultRule.xml"), xml);
    }
    
    private void writeFile(Path path, String content) throws IOException {
        try (FileWriter writer = new FileWriter(path.toFile())) {
            writer.write(content);
        }
        System.out.println("Generated: " + path);
    }
    
    /**
     * Configuration for fault responses
     */
    private static class FaultConfig {
        String statusCode;
        String reasonPhrase;
        String message;
        
        FaultConfig(String statusCode, String reasonPhrase, String message) {
            this.statusCode = statusCode;
            this.reasonPhrase = reasonPhrase;
            this.message = message;
        }
    }
    
    /**
     * Main method for testing
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ApigeeFaultHandlerGenerator <openapi-spec-path> <output-directory>");
            System.exit(1);
        }
        
        try {
            ApigeeFaultHandlerGenerator generator = new ApigeeFaultHandlerGenerator(args[1]);
            generator.generateFaultHandlers(args[0]);
        } catch (IOException e) {
            System.err.println("Error generating fault handlers: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
