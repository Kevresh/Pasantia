package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.platoCompetenciaDTO;
import com.recolecciondatosbackend.Servicios.PlatoCompetenciaService;
import com.recolecciondatosbackend.Servicios.PrecioCompetenciaService;
import com.recolecciondatosbackend.Servicios.RestauranteCompetenciaService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import com.recolecciondatosbackend.modelos.RestauranteCompetencia;
import com.recolecciondatosbackend.repositorios.PlatoCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlatoCompetenciaServiceImpl implements PlatoCompetenciaService {

    @Autowired
    private PlatoCompetenciaRepository platoCompetenciaRepository;

    @Autowired
    private RestauranteCompetenciaService restauranteCompetenciaService;

    @Autowired
    @Lazy
    private PrecioCompetenciaService precioCompetenciaService;

    @Override
    public ResponseEntity<?> crearPlatoCompetencia(platoCompetenciaDTO PlatoCompetenciaDTO) {
        try {
            RestauranteCompetencia restauranteCompetencia = restauranteCompetenciaService.getRestauranteCompetenciaById(PlatoCompetenciaDTO.getIdRestauranteCompetencia());
            PlatoCompetencia platoCompetencia = new PlatoCompetencia(restauranteCompetencia, PlatoCompetenciaDTO.getNombre(), PlatoCompetenciaDTO.getFechaCreacion());
            platoCompetenciaRepository.save(platoCompetencia);

            precioCompetenciaService.crearPrecioCompetencia(PlatoCompetenciaDTO.getPrecio(), platoCompetencia.getIdPlatoCompetencia(), PlatoCompetenciaDTO.getIdPeriodo());

            return ResponseEntity.status(HttpStatus.CREATED).body("El plato " + platoCompetencia.getNombre() + " ha sido creado correctamente.");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el plato");
        }
    }

    @Override
    public PlatoCompetencia getPlatoCompetenciaById(int id) {
        return platoCompetenciaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el plato competencia con el id " + id));
    }
}
