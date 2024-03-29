/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.ahoque.customer.controller;

import org.ahoque.customer.model.ReadContacts;
import org.ahoque.customer.model.ReadCustomer;
import org.ahoque.customer.model.ReadCustomerLocations;
import org.ahoque.customer.model.ReadCustomers;
import org.ahoque.customer.model.ReadRelationship;
import org.ahoque.customer.model.ReadRoles;
import java.util.UUID;
import org.ahoque.customer.model.WriteCustomer;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
@Validated
@Tag(name = "Customer", description = "the Customer API")
public interface CustomersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customers
     *
     * @param writeCustomer  (optional)
     * @return Created (status code 201)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "createCustomer",
        tags = { "Customer" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReadCustomer.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/customers",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ReadCustomer> createCustomer(
        @Parameter(name = "WriteCustomer", description = "") @Valid @RequestBody(required = false) WriteCustomer writeCustomer
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Data\" : { } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customers/{CustomerId}/contacts
     *
     * @param customerId  (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getContacts",
        tags = { "Customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReadContacts.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers/{CustomerId}/contacts",
        produces = { "application/json" }
    )
    default ResponseEntity<ReadContacts> getContacts(
        @Size(min = 36, max = 36) @Parameter(name = "CustomerId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("CustomerId") UUID customerId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Data\" : { \"Contact\" : [ null, null ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customers/{CustomerId}
     *
     * @param customerId  (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Customer not found (status code 404)
     */
    @Operation(
        operationId = "getCustomer",
        tags = { "Customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReadCustomer.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers/{CustomerId}",
        produces = { "application/json" }
    )
    default ResponseEntity<ReadCustomer> getCustomer(
        @Size(min = 36, max = 36) @Parameter(name = "CustomerId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("CustomerId") UUID customerId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Data\" : { } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customers/{CustomerId}/locations
     *
     * @param customerId  (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getCustomerLocations",
        tags = { "Customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReadCustomerLocations.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers/{CustomerId}/locations",
        produces = { "application/json" }
    )
    default ResponseEntity<ReadCustomerLocations> getCustomerLocations(
        @Size(min = 36, max = 36) @Parameter(name = "CustomerId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("CustomerId") UUID customerId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Data\" : { \"CustomerLocation\" : [ { \"CustomerLocationid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"CustomerLocationid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customers
     * 
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getCustomers",
        description = "",
        tags = { "Customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReadCustomers.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers",
        produces = { "application/json" }
    )
    default ResponseEntity<ReadCustomers> getCustomers(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Data\" : { \"Customer\" : [ null, null ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customers/{CustomerId}/relationships
     *
     * @param customerId  (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getReleationship",
        tags = { "Customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReadRelationship.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers/{CustomerId}/relationships",
        produces = { "application/json" }
    )
    default ResponseEntity<ReadRelationship> getReleationship(
        @Size(min = 36, max = 36) @Parameter(name = "CustomerId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("CustomerId") UUID customerId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Data\" : { \"Relationship\" : [ { \"StartDate\" : \"2000-01-23\", \"Role\" : [ { \"RoleName\" : \"RoleName\", \"RelationshipId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"RoleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"RoleName\" : \"RoleName\", \"RelationshipId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"RoleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"RelationshipId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"RelationshipType\" : \"MARRIAGE\", \"EndDate\" : \"2000-01-23\" }, { \"StartDate\" : \"2000-01-23\", \"Role\" : [ { \"RoleName\" : \"RoleName\", \"RelationshipId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"RoleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"RoleName\" : \"RoleName\", \"RelationshipId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"RoleId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"RelationshipId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"RelationshipType\" : \"MARRIAGE\", \"EndDate\" : \"2000-01-23\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customers/{CustomerId}/roles
     *
     * @param customerId  (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getRole",
        tags = { "Customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReadRoles.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers/{CustomerId}/roles",
        produces = { "application/json" }
    )
    default ResponseEntity<ReadRoles> getRole(
        @Size(min = 36, max = 36) @Parameter(name = "CustomerId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("CustomerId") UUID customerId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Data\" : { \"Role\" : [ null, null ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /customers/{CustomerId}
     * Update customer
     *
     * @param customerId  (required)
     * @param writeCustomer  (required)
     * @return successful operation (status code 201)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "updateCustomer",
        description = "Update customer",
        tags = { "Customer" },
        responses = {
            @ApiResponse(responseCode = "201", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReadCustomer.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/customers/{CustomerId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ReadCustomer> updateCustomer(
        @Size(min = 36, max = 36) @Parameter(name = "CustomerId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("CustomerId") UUID customerId,
        @Parameter(name = "WriteCustomer", description = "", required = true) @Valid @RequestBody WriteCustomer writeCustomer
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Data\" : { } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
