package com.ex1.ejercicio1;

import jakarta.annotation.Priority;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Priority(3)
@Component
public class ProcesoC implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ejecutando: "+this.getClass().getName());
    }
}
