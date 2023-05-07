package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;
import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.Servicios.RestauranteService;
import com.recolecciondatosbackend.modelos.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
@CrossOrigin(origins = "http://localhost:4200/")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @GetMapping("/restaurantesConPlatos")
    public ResponseEntity<?> getRestauranteConPlatos() {
        try {
            List<restauranteDTO> restaurantes = restauranteService.obtenerRestaurantesConPlatos();
            return ResponseEntity.ok(restaurantes);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo la informacion de los restaurantes");
        }
    }

    @GetMapping("/getRestaurantes")
    public ResponseEntity<?> getRestaurantes(){
        try {
            List<restauranteBasicoDTO> restaurantes = restauranteService.obtenerRestaurantes();
            return ResponseEntity.ok(restaurantes);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo restaurantes");
        }
    }
}
