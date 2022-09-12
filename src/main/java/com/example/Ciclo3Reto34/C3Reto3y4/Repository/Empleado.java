package com.example.Ciclo3Reto34.C3Reto3y4.Repository;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="empleados")
@Data
public class Empleado {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpleado;

    @Column(name="email", unique = true)
    private String email;

    //conector
    @OneToOne(mappedBy="empleado")
    private PerfilDeEmpleado PerfilDeEmpleado;

    @Column(name="rol")
    @Enumerated(value = EnumType.STRING)
    private Enum_rol rol;

    //connectores

    @ManyToOne
    @JoinColumn(name = "empresa_id")  //3
    private Empresa empresa;

    //connectores

    @OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY) //4
    private List<Transaccion> Transacciones;


    @Column(name="fechaDeCreacion")
    private Date fechaDeCreacion;

    @Column(name="fechaDeActualizacion")
    private Date fechaDeActualizacion;


}
