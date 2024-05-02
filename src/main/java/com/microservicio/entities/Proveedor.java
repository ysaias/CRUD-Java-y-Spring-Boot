package com.microservicio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "proveedores")
@Getter @Setter
@ToString
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    private String web;
    private String contacto;
}
