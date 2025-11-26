package es.grupob.practica5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Luciacazorlacontroller { 
    @GetMapping("/ruta-lucia") 
    public String decirHola() {
        return "¡Hola Mundo! Este es mi controlador en la rama de desarrollo de Lucía Cazorla.";
    }
}