package com.recolecciondatosbackend.Servicios;

import org.springframework.http.ResponseEntity;

public interface PrecioCompetenciaService {

    ResponseEntity<?> crearPrecioCompetencia(int precio, int idPlatoCompetencia, int idPeriodo);
}
