package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.platoDTO;
import com.recolecciondatosbackend.Servicios.PeriodoService;
import com.recolecciondatosbackend.Servicios.PlatoService;
import com.recolecciondatosbackend.Servicios.PrecioService;
import com.recolecciondatosbackend.Servicios.RestauranteService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Precio;
import com.recolecciondatosbackend.modelos.Restaurante;
import com.recolecciondatosbackend.repositorios.PeriodoRepository;
import com.recolecciondatosbackend.repositorios.PlatoRepository;
import com.recolecciondatosbackend.repositorios.PrecioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


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
    @Lazy
    private PrecioService precioService;

    @Autowired
    private PrecioRepository precioRepository;

    @Autowired
    private PeriodoRepository periodoRepository;

    @Override
    public ResponseEntity<?> crearPlato(platoDTO PlatoDTO) {
        try {
            Restaurante restaurante = restauranteService.getRestauranteById(PlatoDTO.getIdRestaurante());
            Plato plato = new Plato(restaurante, PlatoDTO.getNombre(), PlatoDTO.getFechaCreacion());
            platoRepository.save(plato);

            precioService.crearPrecio(PlatoDTO.getPrecio(), plato.getIdPlato(), PlatoDTO.getIdPeriodo());

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
    public ResponseEntity<?> editarPrecioPlatoPorId(int idPlato, int idPeriodo , int nuevoPrecio) {
        //Verificamos si el plato y el periodo existen
        Optional<Plato> optionalPlato = platoRepository.findById(idPlato);
        Optional<Periodo> optionalPeriodo = periodoRepository.findById(idPeriodo);
        if (optionalPlato.isPresent() && optionalPeriodo.isPresent()) {
            Plato plato = optionalPlato.get();
            Periodo periodo = optionalPeriodo.get();

            Optional<Precio> optionalPrecio = precioRepository.findByPlatoAndPeriodo(plato, periodo);

            //Se verifica que el precio exista en el periodo enviado en caso contrario lo crea en el nuevo periodo
            if (optionalPrecio.isPresent()) {
                Precio precio = optionalPrecio.get();
                precio.setPrecio(nuevoPrecio);
                precioRepository.save(precio);

                return ResponseEntity.ok("El precio del plato " + plato.getNombre() + " ha sido actualizado exitosamente.");
            } else {
                precioService.crearPrecio(nuevoPrecio, plato.getIdPlato(), periodo.getIdPeriodo());
                return ResponseEntity.ok("El precio del plato " + plato.getNombre() + " En el periodo "+ periodo.getPeriodo() +" ha sido actualizado exitosamente.");
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
