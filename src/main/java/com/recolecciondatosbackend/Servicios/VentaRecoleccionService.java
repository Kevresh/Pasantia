package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.ventaRecoleccionDTO;
import org.springframework.http.ResponseEntity;

public interface VentaRecoleccionService {

    ResponseEntity<?> crearVentaRecoleccion (ventaRecoleccionDTO VentaRecoleccionDTO);

}
