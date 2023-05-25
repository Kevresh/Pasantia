package com.recolecciondatosbackend.Servicios;

import org.springframework.http.ResponseEntity;

public interface UniversidadCompetenciaService {

    ResponseEntity<?> crearUniversidadCompetencia(String nombreUniversidadCompetencia);

}
