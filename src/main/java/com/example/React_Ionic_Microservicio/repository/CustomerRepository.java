package com.example.React_Ionic_Microservicio.repository;

import com.example.React_Ionic_Microservicio.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
