package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.detalleEvaluacionDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DetalleEvaluacionService {

    ResponseEntity<?> crearDetalleEvaluacion(List<detalleEvaluacionDTO> DetallesEvaluacionesDTO);

}
