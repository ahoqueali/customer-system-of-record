package org.ahoque.customer.controller;

import org.ahoque.customer.dto.ReadCustomer;
import org.ahoque.customer.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customers/{id}")
    public ReadCustomer getCustomer(@PathVariable("id") UUID customerId){
        return customerService.getCustomer(customerId);
    }
}
