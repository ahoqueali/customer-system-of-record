package org.ahoque.customer;

import org.ahoque.customer.model.ReadContactPoints;
import org.ahoque.customer.model.ReadCustomer;
import org.ahoque.customer.model.ReadCustomerLocations;
import org.ahoque.customer.model.ReadCustomers;
import org.ahoque.customer.model.ReadRelationship;
import org.ahoque.customer.model.ReadRoles;
import java.util.UUID;
import org.ahoque.customer.model.WriteCustomer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
@Controller
@RequestMapping("${openapi.customerSystemOfRecordOpenAPI30.base-path:/api/v1.0}")
public class CustomersApiController implements CustomersApi {

    private final NativeWebRequest request;

    @Autowired
    public CustomersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
