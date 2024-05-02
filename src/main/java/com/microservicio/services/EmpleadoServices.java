package com.microservicio.services;

import com.microservicio.entities.Empleado;
import com.microservicio.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpleadoServices implements IEmpleadoService {

    @Autowired
    private EmpleadoRepository repository;

    @Override
    public List<Empleado> getAll(){
        return (List<Empleado>) repository.findAll();
    }

    @Override
    public Empleado getById(Long id) {
        return (Empleado) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Empleado empleado) {
        repository.save(empleado);
    }
}
