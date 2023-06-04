package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.detalleEvaluacionDTO;
import com.recolecciondatosbackend.Servicios.DetalleEvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleEvaluacion")
@CrossOrigin(origins = "http://localhost:3000/")
public class DetalleEvaluacionController {

    @Autowired
    DetalleEvaluacionService detalleEvaluacionService;

    @PostMapping("/crearDetalleEvaluacion")
    public ResponseEntity<?> crearDetalleEvaluacion(@RequestBody List<detalleEvaluacionDTO> DetallesEvaluacionesDTO){
        return detalleEvaluacionService.crearDetalleEvaluacion(DetallesEvaluacionesDTO);
    }
}
