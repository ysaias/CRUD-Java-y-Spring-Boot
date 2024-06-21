package com.example.React_Ionic_Microservicio.services;

import com.example.React_Ionic_Microservicio.entities.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getAll();
    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);

}
