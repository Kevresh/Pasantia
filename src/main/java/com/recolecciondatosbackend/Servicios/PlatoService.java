package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlatoService {
    ResponseEntity<?> crearPlato(platoDTO plato);

    List<platoDTO> obtenerPlatosConRestaurantes();

    Plato getPlatoById(int id);

    ResponseEntity<?> editarPrecioPlatoPorId(int idPlato, int idPeriodo, int nuevoPrecio);
}
