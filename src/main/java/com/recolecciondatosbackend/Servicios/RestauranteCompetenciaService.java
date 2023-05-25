package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.restauranteCompetenciaDTO;
import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.modelos.RestauranteCompetencia;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RestauranteCompetenciaService {

    ResponseEntity<?> creaerRestauranteCompetencia(String nombreRestauranteCompetencia, int idUniversidadCompetencia);
    List<RestauranteCompetencia> obtenerTodosLosRestaurantesCompetencia();
}
