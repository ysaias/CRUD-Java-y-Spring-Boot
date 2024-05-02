package com.microservicio.repository;

import com.microservicio.entities.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface ProveedorRepository extends CrudRepository<Proveedor, Long> {
}
