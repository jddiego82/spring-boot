package com.ex3.ejercicio5.controladores;

import com.ex3.ejercicio5.persona.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {

    private final PersonaService personaService;

    // INYECCIÓN DE DEPENDENCIAS: Spring nos pasa el servicio automáticamente
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    public String mostrarLista(Model model) {
        // Obtenemos 10 personas del servicio
        // El objeto "Model" es la "maleta" donde guardamos los datos para enviarlos al HTML
        model.addAttribute("listaPersonas", personaService.find(10));
        return "lista"; // Devuelve lista.html
    }

    @GetMapping("/personas/una")
    public String mostrarUna(Model model) {
        // Obtenemos 1 sola persona
        model.addAttribute("persona", personaService.findOne());
        return "detalle"; // Devuelve detalle.html
    }
}
