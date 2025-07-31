package com.example.DTO.Controller;

import com.example.DTO.DTO.PersonaDireccionDTO;
import com.example.DTO.Entity.Persona;
import com.example.DTO.Service.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<PersonaDireccionDTO> getAll() {
        return personaService.getAllPersonas();
    }

    @PostMapping
    public PersonaDireccionDTO save(@RequestBody Persona persona) {
        return personaService.savePersona(persona);
    }
}