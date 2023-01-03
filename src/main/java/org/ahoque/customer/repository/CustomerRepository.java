package org.ahoque.customer.repository;

import org.ahoque.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, UUID> {

    List<Customer> findByFirstName(String firstName);

    Customer findByCustomerId(UUID customerId);
}
