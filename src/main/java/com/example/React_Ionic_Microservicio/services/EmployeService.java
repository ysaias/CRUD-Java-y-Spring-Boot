package com.example.React_Ionic_Microservicio.services;

import com.example.React_Ionic_Microservicio.entities.Employees;
import com.example.React_Ionic_Microservicio.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService implements IEmployeService{

    @Autowired
    private EmployeRepository repository;

    @Override
    public List<Employees> getAll(){
        return (List<Employees>) repository.findAll();
    }

    @Override
    public Employees getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        repository.deleteById(id);
    }

    @Override
    public void save(Employees employees){
        repository.save(employees);
    }
}
