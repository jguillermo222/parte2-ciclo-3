package com.example.Ciclo3Reto34.C3Reto3y4.Repository;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="prueba1")
public class puebasupa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    private String apellido;
    private String email;


}
