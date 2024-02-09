package com.universidad.estudiantes.logica;

import com.universidad.estudiantes.controller.DTO.EstudianteDTO;
import com.universidad.estudiantes.persistencia.Estudiante;
import com.universidad.estudiantes.persistencia.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteLogica {
    private EstudianteRepository estudianteRepository;

    public EstudianteLogica(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public List<Estudiante> obtenerEstudiantes() {
        return estudianteRepository.findAll();
    }

    public void guardarEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombres(estudianteDTO.getNombres());
        estudiante.setApellidos(estudianteDTO.getApellidos());
        estudiante.setEdad(estudianteDTO.getEdad());
        estudiante.setCarrera(estudianteDTO.getCarrera());
        estudiante.setSemestre(1);
        estudianteRepository.save(estudiante);
    }
}
