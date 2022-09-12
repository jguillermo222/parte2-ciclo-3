package com.example.Ciclo3Reto34.C3Reto3y4.Repository;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="perfil")
@Data

public class PerfilDeEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cedula;
    @Column
    private String image;
    @Column
    private String telefono;

    //connectores
    @OneToOne
    @JoinColumn(name="empleado_id")
    private Empleado empleado;

    @Column
    private String celular;
    @Column
    private Date fechaDeCreacion;
    @Column
    private Date fechaDeActualizacion;










}
