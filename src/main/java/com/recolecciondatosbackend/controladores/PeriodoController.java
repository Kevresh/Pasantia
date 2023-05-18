package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.periodoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/periodo")
@CrossOrigin(origins = "http://localhost:3000/")
public class PeriodoController {

    @Autowired
    private com.recolecciondatosbackend.Servicios.PeriodoService PeriodoService;


    @GetMapping("/getPeriodos")
    public ResponseEntity<?> getRestaurantes(){
        try {
            List<periodoDTO> periodos = PeriodoService.obtenerPeriodo();
            return ResponseEntity.ok(periodos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo los periodos");
        }
    }
}
