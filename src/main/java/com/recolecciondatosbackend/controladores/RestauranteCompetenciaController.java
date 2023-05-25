package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.restauranteCompetenciaDTO;
import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.DTO.universidadCompetenciaDTO;
import com.recolecciondatosbackend.Servicios.RestauranteCompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restauranteCompetencia")
@CrossOrigin(origins = "http://localhost:3000/")
public class RestauranteCompetenciaController {

    @Autowired
    RestauranteCompetenciaService restauranteCompetenciaService;

    @PostMapping("/crear/{nombreRestauranteCompetencia}/{idUniversidadCompetencia}")
    public ResponseEntity<?> crearUniversidadCompetencia(@PathVariable String nombreRestauranteCompetencia, @PathVariable int idUniversidadCompetencia) {
        return restauranteCompetenciaService.creaerRestauranteCompetencia(nombreRestauranteCompetencia, idUniversidadCompetencia);
    }



}
