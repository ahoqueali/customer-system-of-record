package org.ahoque.customer.service;

import org.ahoque.customer.model.ReadCustomers;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CustomerService {

     ReadCustomers getCustomer(UUID customerId);

}
