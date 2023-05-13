package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.comparacionPlatoDTO;
import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.Servicios.ComparacionPlatoService;
import com.recolecciondatosbackend.modelos.ComparacionPlato;
import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comparacionPlato")
@CrossOrigin(origins = "http://localhost:3000/")
public class ComparacionPlatoController {

    @Autowired
    ComparacionPlatoService comparacionPlatoService;

    @PostMapping("/crearComparacion")
    public ResponseEntity<?> crearComparacion(@RequestBody comparacionPlatoDTO nuevaComparacionRequest) {
        return comparacionPlatoService.crearComparacion(nuevaComparacionRequest);
    }

}
