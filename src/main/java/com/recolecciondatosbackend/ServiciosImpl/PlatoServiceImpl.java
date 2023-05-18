package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.platoBasicoDTO;
import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.Servicios.PlatoService;
import com.recolecciondatosbackend.Servicios.RestauranteService;
import com.recolecciondatosbackend.Servicios.periodoService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Restaurante;
import com.recolecciondatosbackend.repositorios.PlatoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlatoServiceImpl implements PlatoService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PlatoRepository platoRepository;

    @Autowired
    private RestauranteService restauranteService;

    @Autowired
    private periodoService PeriodoService;

    @Override
    public ResponseEntity<?> crearPlato(platoBasicoDTO PlatoBasicoDTO) {
        try{
            Restaurante restaurante = restauranteService.getRestauranteById(PlatoBasicoDTO.getIdRestaurante());
            Periodo periodo = PeriodoService.getPeriodoById(PlatoBasicoDTO.getIdPeriodo());
            Plato plato = new Plato(restaurante, periodo, PlatoBasicoDTO.getNombre(), PlatoBasicoDTO.getPrecio(), PlatoBasicoDTO.getFechaCreacion());
            platoRepository.save(plato);
            return ResponseEntity.status(HttpStatus.CREATED).body("El plato " + plato.getNombre() + " ha sido creado correctamente.");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el plato");
        }
    }

    @Override
    public List<platoDTO> obtenerPlatosConRestaurantes() {
        List<Plato> platos = platoRepository.findAll();
        return platos.stream()
                .map(plato -> modelMapper.map(plato, platoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public Plato getPlatoById(int id) {
        return platoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el plato con el id " + id));
    }

    @Override
    public ResponseEntity<?> editarPrecioPlatoPorId(int id, int nuevoPrecio) {
        Optional<Plato> optionalPlato = platoRepository.findById(id);
        if (optionalPlato.isPresent()) {
            Plato plato = optionalPlato.get();
            plato.setPrecio(nuevoPrecio);
            platoRepository.save(plato);

            return ResponseEntity.ok("El precio del plato " + plato.getNombre() + " ha sido actualizado exitosamente.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
