package com.microservicio.controller;

import com.microservicio.entities.Empleado;
import com.microservicio.services.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private IEmpleadoService services;

    @GetMapping("/api/empleados")
    public List<Empleado> getAll(){
        return services.getAll();
    }

    @GetMapping("/api/empleado/{id}")
    public Empleado getById(@PathVariable String id){
        return services.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/empleado/{id}")
    public void remove(@PathVariable String id){
        services.remove(Long.parseLong(id));
    }

    @PostMapping("/api/empleado")
    public void save(@RequestBody Empleado empleado){
        services.save(empleado);
    }
}
