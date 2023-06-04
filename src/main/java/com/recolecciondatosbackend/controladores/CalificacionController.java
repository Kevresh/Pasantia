package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.calificacionDTO;
import com.recolecciondatosbackend.Servicios.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calificacion")
@CrossOrigin(origins = "http://localhost:3000/")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @GetMapping("/getCalificaciones")
    public ResponseEntity<?> getCalificaciones(){
        try {
            List<calificacionDTO> calificaciones = calificacionService.obtenerCalificaciones();
            return ResponseEntity.ok(calificaciones);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo calificaciones");
        }
    }

}
