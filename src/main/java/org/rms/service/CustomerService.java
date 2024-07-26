package org.rms.service;

import org.rms.dto.Customer;

public interface CustomerService {


    void add(Customer customer);


    void addEmployee(Customer customer);

    Customer addCustomer(Customer customer);


    void deleteCustomerById(Long id);


    Customer findById(Long id);

    Customer findByName(String firstName);

    Customer findByFirstName(String firstName);

    Customer updateCustomer(Customer customer);
}
