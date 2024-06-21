package com.example.React_Ionic_Microservicio.repository;

import com.example.React_Ionic_Microservicio.entities.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends CrudRepository<Employees, Long> {
}
