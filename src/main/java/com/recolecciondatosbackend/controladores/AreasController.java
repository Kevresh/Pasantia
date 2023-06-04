package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.areasDTO;
import com.recolecciondatosbackend.DTO.preguntasDTO;
import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.Servicios.AreaService;
import com.recolecciondatosbackend.modelos.Areas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/areas")
@CrossOrigin(origins = "http://localhost:3000/")
public class AreasController {

    @Autowired
    AreaService areaService;

    @Autowired


    @GetMapping("/areasConPreguntas")
    public ResponseEntity<?> getAreaConPreguntas() {
        try {
            List<areasDTO> areas = areaService.obtenerAreasConPreguntas();
            return ResponseEntity.ok(areas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo la informacion de las areas");
        }
    }

    @GetMapping("/obtenerPreguntasConIdArea/{idArea}")
    public ResponseEntity<?> obtenerPreguntasConIdArea(@PathVariable("idArea") int idArea) {
        try {
            areasDTO area = areaService.obtenerPreguntasConIdArea(idArea);
            if (area != null) {
                return ResponseEntity.ok(area);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo el área y sus preguntas");
        }
    }


}
