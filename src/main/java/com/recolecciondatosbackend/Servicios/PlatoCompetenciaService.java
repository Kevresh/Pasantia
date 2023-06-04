package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.platoCompetenciaDTO;
import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import org.springframework.http.ResponseEntity;

public interface PlatoCompetenciaService {
    ResponseEntity<?> crearPlatoCompetencia(platoCompetenciaDTO PlatoCompetenciaDTO);

    PlatoCompetencia getPlatoCompetenciaById(int id);
}
