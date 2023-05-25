package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.Servicios.UniversidadCompetenciaService;
import com.recolecciondatosbackend.modelos.UniversidadCompetencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/universidadCompetencia")
@CrossOrigin(origins = "http://localhost:3000/")
public class UniversidadCompetenciaController {

    @Autowired
    UniversidadCompetenciaService universidadCompetenciaService;

    @PostMapping("/crear/{nombreUniversidadCompetencia}")
    public ResponseEntity<?> crearUniversidadCompetencia(@PathVariable String nombreUniversidadCompetencia) {
        return universidadCompetenciaService.crearUniversidadCompetencia(nombreUniversidadCompetencia);
    }
}
