package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.platoCompetenciaDTO;
import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.Servicios.PlatoCompetenciaService;
import com.recolecciondatosbackend.Servicios.PlatoService;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/platoCompetencia")
@CrossOrigin(origins = "http://localhost:3000/")
public class PlatoCompetenciaController {

    @Autowired
    PlatoCompetenciaService platoCompetenciaService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearPlatoCompetencia(@RequestBody platoCompetenciaDTO PlatoCompetenciaDTO) {
        return platoCompetenciaService.crearPlatoCompetencia(PlatoCompetenciaDTO);
    }
}
