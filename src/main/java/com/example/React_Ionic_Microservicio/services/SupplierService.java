package com.example.React_Ionic_Microservicio.services;

import com.example.React_Ionic_Microservicio.entities.Suppliers;
import com.example.React_Ionic_Microservicio.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService{

    @Autowired
    private SupplierRepository repository;

    @Override
    public List<Suppliers> getAll() {
        return (List<Suppliers>) repository.findAll();
    }

    @Override
    public Suppliers getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Suppliers suppliers) {
        repository.save(suppliers);
    }
}
