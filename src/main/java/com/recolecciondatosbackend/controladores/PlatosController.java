package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.Servicios.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platos")
@CrossOrigin(origins = "http://localhost:3000/")
public class PlatosController {

    @Autowired
    private PlatoService platoService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearPlato(@RequestBody platoDTO nuevoPlatoRequest) {
        return platoService.crearPlato(nuevoPlatoRequest);
    }

    @GetMapping("/PlatosConRestaurantes")
    public ResponseEntity<?> getPlatosConRestaurante() {
        try {
            List<platoDTO> platos = platoService.obtenerPlatosConRestaurantes();
            return ResponseEntity.ok(platos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo platos con restaurantes: " + e.getMessage());
        }
    }

    @PutMapping("/EditarPrecio/{idPlato}/{idPeriodo}/{precio}")
    public ResponseEntity<?> editarPrecioPlatoPorId(@PathVariable int idPlato,@PathVariable int idPeriodo, @PathVariable int precio){
            return platoService.editarPrecioPlatoPorId(idPlato, idPeriodo ,precio);
    }
}
