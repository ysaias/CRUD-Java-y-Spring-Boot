package com.microservicio.services;

import com.microservicio.entities.Proveedor;
import com.microservicio.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProveedorServices implements IProveedorServices{
    @Autowired
    private ProveedorRepository repository;

    @Override
    public List<Proveedor> getAll(){
        return (List<Proveedor>) repository.findAll();
    }

    @Override
    public Proveedor getById(Long id) {
        return (Proveedor) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Proveedor proveedor) {
        repository.save(proveedor);
    }
}
