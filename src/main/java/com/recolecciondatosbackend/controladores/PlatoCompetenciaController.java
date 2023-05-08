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
@CrossOrigin(origins = "http://localhost:4200/")
public class PlatoCompetenciaController {

    @Autowired
    PlatoCompetenciaService platoCompetenciaService;

    @PostMapping("/crearPlatoCompetencia")
    public ResponseEntity<?> crearPlatoCompetencia(@RequestBody platoCompetenciaDTO nuevoPlatoRequest) {
        PlatoCompetencia plato = new PlatoCompetencia(nuevoPlatoRequest.getIdPlato(), nuevoPlatoRequest.getNombreUniversidad(), nuevoPlatoRequest.getNombreRestaurante(), nuevoPlatoRequest.getNombre(), nuevoPlatoRequest.getPrecio(), nuevoPlatoRequest.getFechaCreacion());
        return platoCompetenciaService.crearPlatoCompetencia(plato);
    }
}
