package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.platoBasicoDTO;
import com.recolecciondatosbackend.DTO.restauranteCompetenciaDTO;
import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.DTO.universidadCompetenciaDTO;
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
public class UniversidadCompetenciaServiceImpl implements UniversidadCompetenciaService {
    @Autowired
    UniversidadCompetenciaRepository universidadCompetenciaRepository;

    @Autowired
    RestauranteCompetenciaRepository restauranteCompetenciaRepository;

    @Override
    public ResponseEntity<?> crearUniversidadCompetencia(String nombreUniversidadCompetencia) {
        try {
            UniversidadCompetencia universidadCompetencia = new UniversidadCompetencia(nombreUniversidadCompetencia);
            universidadCompetenciaRepository.save(universidadCompetencia);
            return ResponseEntity.status(HttpStatus.CREATED).body("La universidad " + universidadCompetencia.getUniversidad() + " ha sido creada correctamente.");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando la universidad Competencia");
        }
    }

    @Override
    public List<UniversidadCompetencia> obtenerTodasLasUniversidades() {
        return universidadCompetenciaRepository.findAll();
    }

    @Override
    public List<universidadCompetenciaDTO> ObtenerUniversidadesConRestaurantes() {
        List<UniversidadCompetencia> universidades = obtenerTodasLasUniversidades();
        List<universidadCompetenciaDTO> universidadesDTO = new ArrayList<>();
        for (UniversidadCompetencia universidad : universidades) {
            universidadCompetenciaDTO universidadDTO = new universidadCompetenciaDTO();
            universidadDTO.setIdUniversidad(universidad.getIdUniversidadCompetencia());
            universidadDTO.setNombre(universidad.getUniversidad());
            List<RestauranteCompetencia> restauranteCompetencias = restauranteCompetenciaRepository.findAllByUniversidadCompetencia(universidad);
            if (restauranteCompetencias != null && !restauranteCompetencias.isEmpty()) {
                List<restauranteCompetenciaDTO> restauranteDTO = new ArrayList<>();
                for (RestauranteCompetencia restauranteCompetencia : restauranteCompetencias) {
                    restauranteCompetenciaDTO restauranteCompetenciaDTO = new restauranteCompetenciaDTO(restauranteCompetencia.getIdRestauranteCompetencia(), restauranteCompetencia.getNombreRestaurante());
                    restauranteDTO.add(restauranteCompetenciaDTO);
                }
                universidadDTO.setRestaurantes(restauranteDTO);
            }
            universidadesDTO.add(universidadDTO);
        }
        return universidadesDTO;
    }

    @Override
    public UniversidadCompetencia getUniversidadCompetenciaoById(int id) {
        return universidadCompetenciaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe la universidad con el id " + id));
    }
}
