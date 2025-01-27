package com.upiiz.relaciones.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;

    // Un curso tiene muchas lecciones
    @OneToMany(targetEntity = Leccion.class, fetch = FetchType.LAZY, mappedBy = "curso")
    private List<Leccion> lecciones;


}
