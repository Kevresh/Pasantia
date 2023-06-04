package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;
import com.recolecciondatosbackend.Servicios.ServicioService;
import com.recolecciondatosbackend.modelos.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servicio")
@CrossOrigin(origins = "http://localhost:3000/")
public class ServicioController {

    @Autowired
    ServicioService servicioService;

    @GetMapping("/obtenerServicios")
    public ResponseEntity<?> getServicios(){
        try {
            List<Servicio> servicios = servicioService.obtenerServicios();
            return ResponseEntity.ok(servicios);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo restaurantes");
        }
    }
}
