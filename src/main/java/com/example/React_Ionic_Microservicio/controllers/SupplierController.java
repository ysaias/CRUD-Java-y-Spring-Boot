package com.example.React_Ionic_Microservicio.controllers;

import com.example.React_Ionic_Microservicio.entities.Suppliers;
import com.example.React_Ionic_Microservicio.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    private ISupplierService service;

    @GetMapping("/api/proveedores")
    public List<Suppliers> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/proveedor/{id}")
    public Suppliers getById(@PathVariable String id){
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/proveedor/{id}")
    public void remove(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/proveedor")
    public void save(@RequestBody Suppliers suppliers){
        service.save(suppliers);
    }
}
