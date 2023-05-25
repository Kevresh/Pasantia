package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.platoBasicoDTO;
import com.recolecciondatosbackend.DTO.restauranteCompetenciaDTO;
import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.DTO.universidadCompetenciaDTO;
import com.recolecciondatosbackend.Servicios.RestauranteCompetenciaService;
import com.recolecciondatosbackend.Servicios.UniversidadCompetenciaService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Restaurante;
import com.recolecciondatosbackend.modelos.RestauranteCompetencia;
import com.recolecciondatosbackend.modelos.UniversidadCompetencia;
import com.recolecciondatosbackend.repositorios.RestauranteCompetenciaRepository;
import com.recolecciondatosbackend.repositorios.UniversidadCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestauranteCompetenciaServiceImpl implements RestauranteCompetenciaService {

    @Autowired
    UniversidadCompetenciaService universidadCompetenciaService;
    @Autowired
    RestauranteCompetenciaRepository restauranteCompetenciaRepository;
    @Override
    public ResponseEntity<?> creaerRestauranteCompetencia(String nombreRestauranteCompetencia, int idUniversidadCompetencia) {
        try{
            UniversidadCompetencia universidadCompetencia = universidadCompetenciaService.getUniversidadCompetenciaoById(idUniversidadCompetencia);
            RestauranteCompetencia restauranteCompetencia = new RestauranteCompetencia();
            restauranteCompetencia.setUniversidadCompetencia(universidadCompetencia);
            restauranteCompetencia.setNombreRestaurante(nombreRestauranteCompetencia);
            restauranteCompetenciaRepository.save(restauranteCompetencia);
            return ResponseEntity.status(HttpStatus.CREATED).body("El restaurante " + restauranteCompetencia.getNombreRestaurante() + " ha sido creada correctamente.");

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el restaurante competencia");
        }
    }

    @Override
    public List<RestauranteCompetencia> obtenerTodosLosRestaurantesCompetencia() {
        return restauranteCompetenciaRepository.findAll();
    }

    @Override
    public RestauranteCompetencia getRestauranteCompetenciaById(int idRestauranteCompetencia) {
        return restauranteCompetenciaRepository.findById(idRestauranteCompetencia)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el restaurante con el id " + idRestauranteCompetencia));
    }

}
