package com.example.Ciclo3Reto34.C3Reto3y4.Repository;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="empresas")
@Data

public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;

    @Column(name = "nombre",unique=true)
    private String nombre;

    @Column (name = "documento", unique=true)
    private String rut;

    @Column(name="telefono")
    private String telefono;

    @Column(name="direccion")
    private String direccion;


    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY) //3
    private List<Empleado> Empleados;

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY) //5
    private List<Transaccion> Transacciones;

    @Column(name="fechaDeCreacion")
    private Date fechaDeCreacion;

    @Column (name="fechaDeActualizacion")
    private Date fechaDeActualizacion;


}
