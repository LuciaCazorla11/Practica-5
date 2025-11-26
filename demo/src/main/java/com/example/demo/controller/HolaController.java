package es.grupob.practica5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "¡Hola Mundo! Soy LUCIA ESPEJO y este es mi controlador de mi rama de desarrollo";
    }
}
