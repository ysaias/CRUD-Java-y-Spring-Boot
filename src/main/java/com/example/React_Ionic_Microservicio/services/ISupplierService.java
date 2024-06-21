package com.example.React_Ionic_Microservicio.services;

import com.example.React_Ionic_Microservicio.entities.Suppliers;

import java.util.List;

public interface ISupplierService {

    List<Suppliers> getAll();
    Suppliers getById(Long id);
    void remove(Long id);
    void save(Suppliers suppliers);

}
