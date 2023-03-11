package org.ahoque.customer.service.impl;

import org.ahoque.customer.model.ReadCustomers;
import org.ahoque.customer.repository.CustomerRepository;
import org.ahoque.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceimpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceimpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public ReadCustomers getCustomer(UUID customerId){

//        Customer customer = customerRepository.findByCustomerId(customerId);
//        ReadCustomerDataCustomer readCustomerDataCustomer = new ReadCustomerDataCustomer();
//        readCustomerDataCustomer.setCustomerId(customer.getCustomerId());
//        readCustomerDataCustomer.setFirstName(customer.getFirstName());
//        ReadCustomerData data = new ReadCustomerData();
//        data.setCustomer(readCustomerDataCustomer);
//        ReadCustomer readCustomer = new ReadCustomer();
//        readCustomer.setData(data);
//        return readCustomer;

        return null;
    }
}
