package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.platoBasicoDTO;
import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlatoService {
    ResponseEntity<?> crearPlato(platoBasicoDTO plato);

    List<platoDTO> obtenerPlatosConRestaurantes();

    Plato getPlatoById(int id);
}
