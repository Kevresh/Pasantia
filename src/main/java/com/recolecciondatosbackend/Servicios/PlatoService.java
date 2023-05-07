package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlatoService {
    public ResponseEntity<?> crearPlato(Plato plato);

    public List<platoDTO> obtenerPlatosConRestaurantes();
}
