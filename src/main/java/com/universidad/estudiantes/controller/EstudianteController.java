package com.universidad.estudiantes.controller;

import com.universidad.estudiantes.controller.DTO.EstudianteDTO;
import com.universidad.estudiantes.controller.DTO.OutputDTO;
import com.universidad.estudiantes.logica.EstudianteLogica;
import com.universidad.estudiantes.persistencia.Estudiante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {
    private EstudianteLogica estudianteLogica;

    public EstudianteController(EstudianteLogica estudianteLogica) {
        this.estudianteLogica = estudianteLogica;
    }

    @PostMapping(path = "/estudiante/agregar")
    public OutputDTO guardarEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
        estudianteLogica.guardarEstudiante(estudianteDTO);
        return new OutputDTO("Estudiante creado correctamente.");
    }

    @GetMapping(path = "/estudiantes")
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteLogica.obtenerEstudiantes();
    }

    @GetMapping(path ="/test")
    public String test() {
        return "El microservicio se ha actualizado";
    }

    @GetMapping(path ="/test2")
    public String test2() {
        return "El microservicio se ha actualizado otra vez";
    }

    @GetMapping(path ="/test3")
    public String test3() {
        return "El microservicio se ha actualizado una vez ,as";
    }
    @GetMapping(path ="/test4")
    public String test4() {
        return "El microservicio ya sirve por fin bendito DIos";
    }

    @GetMapping(path ="/test5")
    public String test5() {
        return "El microservicio ahora sí sirve";
    }
}
