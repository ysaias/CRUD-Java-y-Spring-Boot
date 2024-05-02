package com.microservicio.services;


import com.microservicio.entities.Customer;
import com.microservicio.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerServices implements ICustomerServices {

    @Autowired
    private CustomerRepository repository;

        @Override
        public List<Customer> getAll(){
           return (List<Customer>) repository.findAll();
        }

    @Override
    public Customer getById(Long id) {
        return (Customer) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }
}
