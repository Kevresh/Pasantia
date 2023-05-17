package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;
import com.recolecciondatosbackend.Servicios.ResiduoService;
import com.recolecciondatosbackend.modelos.Residuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/residuo")
@CrossOrigin(origins = "http://localhost:3000/")
public class ResiduoController {

    @Autowired
    ResiduoService residuoService;

    @GetMapping("/obtenerResiduos")
    public ResponseEntity<?> obtenerResiduos(){
        try {
            List<Residuo> residuos = residuoService.obtenerResiduos();
            return ResponseEntity.ok(residuos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo los residuos");
        }
    }
}
