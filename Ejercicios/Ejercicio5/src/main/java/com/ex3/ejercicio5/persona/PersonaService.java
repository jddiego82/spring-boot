package com.ex3.ejercicio5.persona;

import java.util.List;
import com.ex3.ejercicio5.Persona;

public interface PersonaService {
    // Devuelve una lista con "count" personas
    List<Persona> find(int count);

    // Devuelve una sola persona
    Persona findOne();
}
