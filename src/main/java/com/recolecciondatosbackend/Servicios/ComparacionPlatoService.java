package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.comparacionPlatoDTO;
import org.springframework.http.ResponseEntity;

public interface ComparacionPlatoService {

    ResponseEntity<?> crearComparacion(comparacionPlatoDTO comparacionPlato);


}
