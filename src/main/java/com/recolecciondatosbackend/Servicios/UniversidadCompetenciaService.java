package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.restauranteCompetenciaDTO;
import com.recolecciondatosbackend.DTO.universidadCompetenciaDTO;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.UniversidadCompetencia;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UniversidadCompetenciaService {

    ResponseEntity<?> crearUniversidadCompetencia(String nombreUniversidadCompetencia);
    List<universidadCompetenciaDTO> ObtenerUniversidadesConRestaurantes();
    List<UniversidadCompetencia> obtenerTodasLasUniversidades();
    UniversidadCompetencia getUniversidadCompetenciaoById(int id);
}
