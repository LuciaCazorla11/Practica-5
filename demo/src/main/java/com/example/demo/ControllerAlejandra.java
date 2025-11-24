package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAlejandra {

    @GetMapping("/saludo")
    public String saludar() {
        return "¡Hola Mundo! Soy Alejandra y este es el controlador de mi rama de desarrollo.";
    }
}

