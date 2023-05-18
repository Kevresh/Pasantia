package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.detalleEvaluacionDTO;
import com.recolecciondatosbackend.DTO.detalleRecoleccionDTO;
import com.recolecciondatosbackend.Servicios.DetalleRecoleccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleRecoleccion")
@CrossOrigin(origins = "http://localhost:3000/")
public class DetalleRecoleccionController {

    @Autowired
    DetalleRecoleccionService detalleRecoleccionService;

    @PostMapping("/crearDetalleRecoleccion")
    public ResponseEntity<?> crearDetalleEvaluacion(@RequestBody List<detalleRecoleccionDTO> DetalleRecoleccionDTO){
        return detalleRecoleccionService.crearDetalleRecoleccion(DetalleRecoleccionDTO);
    }

}
