package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.detalleEvaluacionDTO;
import com.recolecciondatosbackend.DTO.detalleRecoleccionDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DetalleRecoleccionService {

    ResponseEntity<?> crearDetalleRecoleccion(List<detalleRecoleccionDTO> DetalleRecoleccionDTO);

}
