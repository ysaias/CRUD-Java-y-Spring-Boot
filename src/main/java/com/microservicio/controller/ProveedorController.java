package com.microservicio.controller;

import com.microservicio.entities.Proveedor;
import com.microservicio.services.IProveedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProveedorController {

    @Autowired
    private IProveedorServices services;

    @GetMapping("/api/proveedores")
    public List<Proveedor> getAll(){
        return services.getAll();
    }

    @GetMapping("/api/proveedor/{id}")
    public Proveedor getById(@PathVariable String id){
        return services.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/proveedor/{id}")
    public void remove(@PathVariable String id){
        services.remove(Long.parseLong(id));
    }

    @PostMapping("/api/proveedor")
    public void save(@RequestBody Proveedor proveedor){
        services.save(proveedor);
    }
}
