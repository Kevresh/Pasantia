package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.Servicios.PlatoService;
import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platos")
@CrossOrigin(origins = "http://localhost:4200/")
public class PlatosController {

    @Autowired
    private PlatoService platoService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearPlato(@RequestBody platoDTO nuevoPlatoRequest) {
        Plato plato = new Plato(nuevoPlatoRequest.getRestaurante(), nuevoPlatoRequest.getNombre(), nuevoPlatoRequest.getPrecio(),nuevoPlatoRequest.getFechaCreacion());
        return platoService.crearPlato(plato);
    }

    @GetMapping("/PlatosConRestaurantes")
    public ResponseEntity<List<platoDTO>> getPlatosConRestaurante(){
        List<platoDTO> platos = platoService.obtenerPlatosConRestaurantes();
        return ResponseEntity.ok(platos);
    }
}
