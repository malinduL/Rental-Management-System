package org.rms.service.Impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.rms.dto.Customer;
import org.rms.entity.CustomerEntity;
import org.rms.repository.CustomerRepository;
import org.rms.service.CustomerService;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

        final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }


    @Override
    public void add(Customer customer) {

    }

    @Override
        public void addEmployee(Customer customer) {

            CustomerEntity employeeEntity = new ObjectMapper().convertValue(customer, CustomerEntity.class);
            repository.save(employeeEntity);
        }


    @Override
    public Customer addCustomer(Customer customer) {

        return customer;
    }

    @Override
    public void deleteCustomerById(Long id) {

    }

    @Override
        public Customer findById(Long id) {
            if(repository.findById(id).isPresent()){
                Optional<CustomerEntity> byId = repository.findById(id);
                return new ObjectMapper().convertValue(byId.get(), Customer.class);
            }
            return new Customer();
        }

    @Override
    public Customer findByName(String firstName) {
        return null;
    }

    @Override
        public Customer findByFirstName(String firstName) {

            return new ObjectMapper().convertValue(repository.findByName(firstName),Customer.class);
        }

    @Override
    public Customer updateCustomer(Customer customer) {
        return null;
    }

}

