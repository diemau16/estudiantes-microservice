package com.universidad.estudiantes.controller.DTO;

import lombok.Data;

@Data
public class OutputDTO {
    private String output;

    public OutputDTO(String output) {
        this.output = output;
    }
}
