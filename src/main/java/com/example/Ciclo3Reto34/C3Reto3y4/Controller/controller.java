package com.example.Ciclo3Reto34.C3Reto3y4.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/") // imprime hola en el host:8080/hola

public class controller {

    @GetMapping
    public String decirHola(){

        return "hola mundo ok";

    }



}
