package com.microservicio.controller;

import com.microservicio.entities.Customer;
import com.microservicio.services.ICustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
public class CustomerController {

    @Autowired
    private ICustomerServices services;

    @GetMapping("/api/customers")
    public List<Customer> getAll(){
       return services.getAll();
    }

    @GetMapping("/api/customer/{id}")
    public Customer getById(@PathVariable String id){
        return services.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/customer/{id}")
    public void remove(@PathVariable String id){
        services.remove(Long.parseLong(id));
    }

    @PostMapping("/api/customer")
    public void save(@RequestBody Customer customer){
        services.save(customer);
    }
}
