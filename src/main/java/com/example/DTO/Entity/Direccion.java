package com.example.DTO.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private String provincia;
}