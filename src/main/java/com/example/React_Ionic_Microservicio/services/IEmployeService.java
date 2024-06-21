package com.example.React_Ionic_Microservicio.services;

import com.example.React_Ionic_Microservicio.entities.Employees;

import java.util.List;

public interface IEmployeService {

    List<Employees> getAll();
    Employees getById(Long id);
    void remove(Long id);
    void save(Employees employees);

}
