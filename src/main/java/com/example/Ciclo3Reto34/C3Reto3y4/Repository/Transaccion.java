package com.example.Ciclo3Reto34.C3Reto3y4.Repository;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="transacciones")
@Data
public class Transaccion {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTransaccion;
    @Column
    private String concepto;
    @Column
    private float monto;

    //conectores

    @ManyToOne
    @JoinColumn(name = "id_empleado")  //4
    private Empleado empleado;

    //conectores

    @ManyToOne
    @JoinColumn(name = "id_empresa")   //5
    private Empresa empresa;

    @Column
    private Date fechaDeCreacion;
    @Column
    private Date fechaDeActualizacion;

}
