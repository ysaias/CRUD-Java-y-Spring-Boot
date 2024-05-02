package com.microservicio.services;

import com.microservicio.entities.Customer;

import java.util.List;

public interface ICustomerServices {

    List<Customer> getAll();

    Customer getById(Long id);

    void remove(Long id);

    void save(Customer customer);
}
