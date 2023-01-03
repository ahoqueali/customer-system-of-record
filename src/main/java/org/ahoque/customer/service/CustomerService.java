package org.ahoque.customer.service;

import org.ahoque.customer.dto.ReadCustomer;
import org.ahoque.customer.dto.ReadCustomerData;
import org.ahoque.customer.dto.ReadCustomerDataCustomer;
import org.ahoque.customer.model.Customer;
import org.ahoque.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public ReadCustomer getCustomer(UUID customerId){

        Customer customer = customerRepository.findByCustomerId(customerId);
        ReadCustomerDataCustomer readCustomerDataCustomer = new ReadCustomerDataCustomer();
        readCustomerDataCustomer.setCustomerId(customer.getCustomerId());
        readCustomerDataCustomer.setFirstName(customer.getFirstName());
        ReadCustomerData data = new ReadCustomerData();
        data.setCustomer(readCustomerDataCustomer);
        ReadCustomer readCustomer = new ReadCustomer();
        readCustomer.setData(data);
        return readCustomer;
    }
}
