package com.ex3.ejercicio5.persona;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import com.ex3.ejercicio5.Persona;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service // ¡Súper importante! Le dice a Spring: "Soy un Bean de tipo servicio, guárdame"
public class PersonaServiceImpl implements PersonaService {

    private final Faker faker;

    // INYECCIÓN DE DEPENDENCIAS: Spring ve este constructor, busca un Faker en su "bolsa"
    // (el que creaste con @Bean en el Paso 3) y nos lo inyecta aquí automáticamente.
    public PersonaServiceImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public Persona findOne() {
        // Usamos DataFaker para generar datos aleatorios
        String nombre = faker.name().firstName();
        String apellidos = faker.name().lastName() + " " + faker.name().lastName();
        String dni = faker.number().digits(8) + "X"; // 8 números y una letra falsa

        // Datafaker devuelve la fecha en formato Date, la convertimos a LocalDate
        java.time.LocalDate fechaNacimiento = faker.date().birthday()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        return new Persona(nombre, apellidos, dni, fechaNacimiento);
    }

    @Override
    public List<Persona> find(int count) {
        List<Persona> personas = new ArrayList<>();

        // Hacemos un bucle para crear tantas personas como nos pida "count"
        for (int i = 0; i < count; i++) {
            personas.add(findOne()); // Reutilizamos el método de arriba
        }

        return personas;
    }
}
