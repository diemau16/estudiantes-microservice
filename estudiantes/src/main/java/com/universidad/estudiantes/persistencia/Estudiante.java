package com.universidad.estudiantes.persistencia;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Estudiante {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @Column
    private int edad;
    @Column
    private String carrera;
    @Column
    private int semestre;
}
