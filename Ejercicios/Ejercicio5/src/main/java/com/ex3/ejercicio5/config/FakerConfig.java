package com.ex3.ejercicio5.config;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Locale;

@Configuration
public class FakerConfig {

    @Bean
    public Faker faker() {
        // Le pasamos "es" para que nos genere nombres en español
        return new Faker(new Locale("es"));
    }
}
