package org.ahoque.customer.controller.impl;


import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.ahoque.customer.controller.CustomerController;
import org.ahoque.customer.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")
@RestController
public class CustomerControllerImpl implements CustomerController {

    private static final Logger log = LoggerFactory.getLogger(CustomerControllerImpl.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerControllerImpl(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ReadCustomers> createCustomer(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody WriteCustomer body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReadCustomers>(objectMapper.readValue("{\n  \"Data\" : \"{\"Data\":{\"Customer\":{\"CustomerId\":\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"CustomerType\":\"PERSON\",\"FirstName\":\"Ross Poldark\"}}}\"\n}", ReadCustomers.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReadCustomers>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReadCustomers>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReadContactPoints> getContactPoints(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("CustomerId") UUID customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReadContactPoints>(objectMapper.readValue("{\n  \"Data\" : \"{\"Data\":{\"ContactPoint\":[{\"ContactId\":\"66d5e3d3-f8cb-4a05-a151-c7e40e14cedf\",\"ContactType\":\"ELECTRONIC_ADDRESS\",\"ElectronicAddress\":\"ross.poldark@gmail.com\"},{\"ContactId\":\"ca25016c-a985-480f-be92-816fa061272e\",\"ContactType\":\"POSTAL_ADDRESS\",\"Line1\":\"string\",\"Line2\":\"string\",\"Line3\":\"string\",\"Line4\":\"string\"},{\"ContactId\":\"c706fdcc-aed2-43e9-b617-59cfe78a82a9\",\"ContactType\":\"PHONE_ADDRESS\",\"PhoneAddress\":\"694234332434\"},{\"ContactId\":\"29073fc2-9588-4e9f-b82d-4db170d62b10\",\"ContactType\":\"SOCIAL_ADDRESS\",\"SocialAddress\":\"@rosspoldark\"}]}}\"\n}", ReadContactPoints.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReadContactPoints>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReadContactPoints>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReadCustomers> getCustomer(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("CustomerId") UUID customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReadCustomers>(objectMapper.readValue("{\n  \"Data\" : \"{\"Data\":{\"Customer\":{\"CustomerId\":\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"CustomerType\":\"PERSON\",\"FirstName\":\"Ross Poldark\"}}}\"\n}", ReadCustomers.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReadCustomers>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReadCustomers>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReadCustomerLocations> getCustomerLocations(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("CustomerId") UUID customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReadCustomerLocations>(objectMapper.readValue("{\n  \"Data\" : \"{\"Data\":{\"CustomerLocation\":[{\"CustomerLocationid\":\"ad6d61f3-e286-45de-8875-a3cd34752b04\",\"LocationRole\":\"DOMICILE\",\"LocationType\":\"CURRENT_LOCATION\",\"Location\":{\"LocationId\":\"f4e7177f-11ec-4de7-a268-c0bb63f5071e\",\"LocationType\":\"LOCATION_POSTAL_ADDRESS\",\"Line1\":\"string\",\"Line2\":\"string\",\"Line3\":\"string\",\"Line4\":\"string\"}},{\"CustomerLocationid\":\"9aeeedb1-cd6c-494c-8441-78e59b4b9a31\",\"LocationRole\":\"DOMICILE\",\"LocationType\":\"PREVIOUS_LOCATION\",\"Location\":{\"LocationId\":\"52d9fd9f-39aa-4e9f-8113-1309b01de942\",\"LocationType\":\"LOCATION_POSTAL_ADDRESS\",\"Line1\":\"string\",\"Line2\":\"string\",\"Line3\":\"string\",\"Line4\":\"string\"}}]}}\"\n}", ReadCustomerLocations.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReadCustomerLocations>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReadCustomerLocations>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReadCustomers> getCustomers() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReadCustomers>(objectMapper.readValue("{\n  \"Data\" : {\n    \"Customer\" : [ {\n      \"CustomerId\" : \"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\n      \"CustomerType\" : \"PERSON\",\n      \"FirstName\" : \"Ross Poldark\"\n    }, {\n      \"CustomerId\" : \"c0af5c6a-4c9b-4878-b4a5-527db1bf6fb8\",\n      \"CustomerType\" : \"ORGANISATION\",\n      \"Name\" : \"Wheal Leisure\"\n    } ]\n  }\n}", ReadCustomers.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReadCustomers>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReadCustomers>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReadRelationship> getReleationship(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("CustomerId") UUID customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReadRelationship>(objectMapper.readValue("{\n  \"Data\" : {\n    \"Relationship\" : [ {\n      \"RelationshipId\" : \"28537f644-1f3a-4e42-9790-a377769faf75\",\n      \"RelationshipType\" : \"MARRIAGE\",\n      \"StartDate\" : \"1997-07-23\",\n      \"Role\" : [ {\n        \"RoleId\" : \"bd30a691-84ab-4e95-9b07-afec05c78805\",\n        \"RoleType\" : \"HUSBAND\",\n        \"CustomerId\" : \"3fa85f64-5717-4562-b3fc-2c963f66afa6\"\n      }, {\n        \"RoleId\" : \"1a5c9797-c001-4297-ad20-07c825619601\",\n        \"RoleType\" : \"WIFE\",\n        \"CustomerId\" : \"15ca8860-66a0-48d8-96b7-1c25e18bfa93\"\n      } ]\n    } ]\n  }\n}", ReadRelationship.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReadRelationship>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReadRelationship>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReadRoles> getRole(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("CustomerId") UUID customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReadRoles>(objectMapper.readValue("{\n  \"Data\" : \"{\"Data\":{\"Role\":[{\"RoleId\":\"4947cda1-89ef-4397-9166-1a888f1f93ee\",\"RoleType\":\"AGREEMENT_INVOLVEMENT\",\"RoleName\":\"string\",\"RelationshipId\":\"7e9e0818-a854-46f5-9898-ed7f7dd47cdf\"},{\"RoleId\":\"70ec950d-d7cd-4dc7-a004-46ab5cad45c2\",\"RoleType\":\"CUSTOMER_RELATIONSHIP_INVOLVEMENT\",\"RoleName\":\"string\",\"RelationshipId\":\"f714b3ed-d021-4c38-a085-5bff00c8a32c\",\"CustomerRelationshipInvolvementType\":\"CUSTOMER_EMPLOYEE\"}]}}\"\n}", ReadRoles.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReadRoles>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReadRoles>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ReadCustomers> updateCustomer(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("CustomerId") UUID customerId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody WriteCustomer body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ReadCustomers>(objectMapper.readValue("{\n  \"Data\" : \"{\"Data\":{\"Customer\":{\"CustomerId\":\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"CustomerType\":\"PERSON\",\"FirstName\":\"Ross Poldark\"}}}\"\n}", ReadCustomers.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReadCustomers>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReadCustomers>(HttpStatus.NOT_IMPLEMENTED);
    }

}
