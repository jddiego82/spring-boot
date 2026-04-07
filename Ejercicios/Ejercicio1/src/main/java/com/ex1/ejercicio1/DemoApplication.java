package com.ex1.ejercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    /*
    * - Prueba el programa sin añadir anotaciones a las clases. ¿Qué ocurre?
    * Si no meto anotaciones no se imprime nada
    * - Ahora, añade anotaciones a las clases para que sean beans, y vuelve a probar el programa. ¿Ha
        cambiado algo?
    * Si usamos la anotción @Component si se que se ejecuta
    *
    * Añadimos las anotaciones @Priority para ejecutarlas por orden
    * */
    //:
    //Ahora, añade anotaciones a las clases para que sean beans, y vuelve a probar el programa. ¿Ha
    //cambiado algo?
}
