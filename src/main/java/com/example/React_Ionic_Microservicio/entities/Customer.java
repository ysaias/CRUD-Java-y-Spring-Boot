package com.example.React_Ionic_Microservicio.entities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customers")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String nombre;

    @Column(name = "lastname")
    private String apellido;

    @Column(name = "email")
    private String correo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "address")
    private String direccion;

}
