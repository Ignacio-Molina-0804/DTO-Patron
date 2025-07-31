package com.example.DTO.Service;

import com.example.DTO.DTO.PersonaDireccionDTO;
import com.example.DTO.Entity.Persona;
import com.example.DTO.Mapper.PersonaMapper;
import com.example.DTO.Repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService {
    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;

    public PersonaService(PersonaRepository personaRepository, PersonaMapper personaMapper) {
        this.personaRepository = personaRepository;
        this.personaMapper = personaMapper;
    }

    public List<PersonaDireccionDTO> getAllPersonas() {
        return personaRepository.findAll()
                .stream()
                .map(personaMapper::personaToDto)
                .collect(Collectors.toList());
    }

    public PersonaDireccionDTO savePersona(Persona persona) {
        Persona saved = personaRepository.save(persona);
        return personaMapper.personaToDto(saved);
    }
}
