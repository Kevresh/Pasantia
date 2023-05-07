package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;
import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Restaurante;

import java.util.List;

public interface RestauranteService {
   List<Restaurante>obtenerTodosLosRestaurantes();

   List<restauranteDTO> obtenerRestaurantesConPlatos();

   List<restauranteBasicoDTO> obtenerRestaurantes();

}
