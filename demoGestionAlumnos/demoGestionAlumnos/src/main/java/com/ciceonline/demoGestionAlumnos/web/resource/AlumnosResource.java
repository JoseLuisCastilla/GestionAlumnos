package com.ciceonline.demoGestionAlumnos.web.resource;

import com.ciceonline.demoGestionAlumnos.web.resource.dto.AlumnoOldDTO;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class AlumnosResource {

    @RequestMapping(path = "/alumno/validate", method = RequestMethod.POST)
    public void validate (@RequestBody(required = false) AlumnoOldDTO alumnoOldDTO){
        log.info("Recibimos llamada del cliente web");
        log.info(alumnoOldDTO.toString());

    }
}
