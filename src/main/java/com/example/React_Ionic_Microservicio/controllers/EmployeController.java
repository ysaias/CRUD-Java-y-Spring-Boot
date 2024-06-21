package com.example.React_Ionic_Microservicio.controllers;

import com.example.React_Ionic_Microservicio.entities.Employees;
import com.example.React_Ionic_Microservicio.services.IEmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeController {

    @Autowired
    private IEmployeService service;

    @GetMapping("/api/empleados")
    public List<Employees> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/empleado/{id}")
    public Employees getById(@PathVariable String id){
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/empleado/{id}")
    public void remove(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/empleado")
    public void save(@RequestBody Employees employees){
        service.save(employees);
    }
}
