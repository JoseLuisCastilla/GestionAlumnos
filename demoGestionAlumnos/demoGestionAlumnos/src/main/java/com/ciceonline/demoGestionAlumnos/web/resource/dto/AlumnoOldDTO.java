package com.ciceonline.demoGestionAlumnos.web.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoOldDTO {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
}
