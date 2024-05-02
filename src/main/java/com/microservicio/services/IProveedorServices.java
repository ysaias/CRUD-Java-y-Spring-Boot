package com.microservicio.services;

import com.microservicio.entities.Customer;
import com.microservicio.entities.Proveedor;

import java.util.List;

public interface IProveedorServices {

    List<Proveedor> getAll();

    Proveedor getById(Long id);

    void remove(Long id);

    void save(Proveedor proveedor);
}
