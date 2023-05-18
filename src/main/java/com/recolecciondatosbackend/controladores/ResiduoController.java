package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.Servicios.MaterialService;
import com.recolecciondatosbackend.modelos.Material;
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
    MaterialService materialService;

    @GetMapping("/obtenerResiduos")
    public ResponseEntity<?> obtenerResiduos(){
        try {
            List<Material> materials = materialService.obtenerResiduos();
            return ResponseEntity.ok(materials);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo los residuos");
        }
    }
}
