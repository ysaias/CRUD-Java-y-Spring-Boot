package com.microservicio.services;

import com.microservicio.entities.Customer;
import com.microservicio.entities.Empleado;

import java.util.List;

public interface IEmpleadoService {

    List<Empleado> getAll();

    Empleado getById(Long id);

    void remove(Long id);

    void save(Empleado empleado);
}