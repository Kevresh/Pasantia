package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.ventaRecoleccionDTO;
import com.recolecciondatosbackend.Servicios.VentaRecoleccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ventaRecoleccion")
@CrossOrigin(origins = "http://localhost:3000/")
public class VentaRecoleccionController {

    @Autowired
    VentaRecoleccionService ventaRecoleccionService;

    @PostMapping("/crearVentaRecoleccion")
    public ResponseEntity<?> crearPlato(@RequestBody ventaRecoleccionDTO VentaRecoleccionDTO) {
        return ventaRecoleccionService.crearVentaRecoleccion(VentaRecoleccionDTO);
    }
}
