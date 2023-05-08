package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import org.springframework.http.ResponseEntity;

public interface PlatoCompetenciaService {
    ResponseEntity<?> crearPlatoCompetencia(PlatoCompetencia plato);
}
