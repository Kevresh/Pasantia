package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;
import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.Servicios.RestauranteService;
import com.recolecciondatosbackend.Servicios.periodoService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Restaurante;
import com.recolecciondatosbackend.repositorios.PlatoRepository;
import com.recolecciondatosbackend.repositorios.RestauranteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestauranteServiceImpl implements RestauranteService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    RestauranteRepository restauranteRepository;

    @Autowired
    periodoService PeriodoService;

    @Autowired
    PlatoRepository platoRepository;
    @Override
    public List<Restaurante> obtenerTodosLosRestaurantes() {
        return restauranteRepository.findAll();
    }

    @Override
    public Restaurante getRestauranteById(int id) {
        return restauranteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el restaurante con el id " + id));
    }

    @Override
    public List<restauranteDTO> obtenerRestaurantesConPlatos() {
        List<Restaurante> restaurantes = obtenerTodosLosRestaurantes();
        List<restauranteDTO> restaurantesDTO = new ArrayList<>();
        for (Restaurante restaurante : restaurantes) {
            restauranteDTO restauranteDTO = new restauranteDTO();
            restauranteDTO.setIdRestaurante(restaurante.getIdRestaurante());
            restauranteDTO.setNombre(restaurante.getNombre());
            List<Plato> platos = platoRepository.findAllByRestaurante(restaurante);
            if (platos != null && !platos.isEmpty()) {
                List<platoDTO> platosDTO = new ArrayList<>();
                for (Plato plato : platos) {


                    platoDTO platoDTO = new platoDTO(plato.getIdPlato(), plato.getPeriodo().getIdPeriodo(),plato.getNombre(),plato.getPrecio(),plato.getFechaCreacion());

                    platosDTO.add(platoDTO);
                }
                restauranteDTO.setPlatos(platosDTO);
            }
            restaurantesDTO.add(restauranteDTO);
        }
        return restaurantesDTO;
    }

    @Override
    public List<restauranteBasicoDTO> obtenerRestaurantes() {
        List<Restaurante> restaurantes = obtenerTodosLosRestaurantes();
        return restaurantes.stream()
                .map(restaurante -> modelMapper.map(restaurante, restauranteBasicoDTO.class))
                .collect(Collectors.toList());
    }

}
