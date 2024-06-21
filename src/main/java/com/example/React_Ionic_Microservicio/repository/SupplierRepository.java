package com.example.React_Ionic_Microservicio.repository;

import com.example.React_Ionic_Microservicio.entities.Suppliers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends CrudRepository<Suppliers, Long> {
}
