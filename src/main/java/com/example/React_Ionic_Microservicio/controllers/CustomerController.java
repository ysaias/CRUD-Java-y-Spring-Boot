package com.example.React_Ionic_Microservicio.controllers;

import com.example.React_Ionic_Microservicio.entities.Customer;
import com.example.React_Ionic_Microservicio.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @GetMapping("/api/customers")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/customer/{id}")
    public Customer getById(@PathVariable String id){
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/customer/{id}")
    public void remove(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/customer")
    public void save(@RequestBody Customer customer){
        service.save(customer);
    }

}
