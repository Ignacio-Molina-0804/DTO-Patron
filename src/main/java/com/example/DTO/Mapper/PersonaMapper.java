package com.example.DTO.Mapper;

import com.example.DTO.Entity.Persona;
import com.example.DTO.DTO.PersonaDireccionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonaMapper {
    @Mapping(source = "direccion.calle", target = "calle")
    @Mapping(source = "direccion.provincia", target = "provincia")
    PersonaDireccionDTO personaToDto(Persona persona);
}