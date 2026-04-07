package com.ex3.ejercicio5.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // ¡Ojo! Es @Controller, NO @RestController. Esto le dice a Spring que devuelva una página web, no JSON.
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // Esto le dice a Spring: "Busca un archivo llamado index.html y muéstralo"
    }
}
