package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;
import com.recolecciondatosbackend.DTO.universidadCompetenciaDTO;
import com.recolecciondatosbackend.Servicios.UniversidadCompetenciaService;
import com.recolecciondatosbackend.modelos.UniversidadCompetencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/ObtenerUniversidadesConRestaurantes")
    public ResponseEntity<?> crearUniversidadCompetencia() {
        try {
            List<universidadCompetenciaDTO> universidadesCompetencia = universidadCompetenciaService.ObtenerUniversidadesConRestaurantes();
            return ResponseEntity.ok(universidadesCompetencia);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo la informacion de los restaurantes");
        }
    }

    @GetMapping("/getUniversidadesCompetencia")
    public ResponseEntity<?> getUniversidadesCompetencia(){
        try {
            List<UniversidadCompetencia> universidadCompetencias = universidadCompetenciaService.obtenerTodasLasUniversidades();
            return ResponseEntity.ok(universidadCompetencias);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo restaurantes");
        }
    }
}
