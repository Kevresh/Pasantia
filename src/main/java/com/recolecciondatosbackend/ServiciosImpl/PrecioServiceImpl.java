package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.PeriodoService;
import com.recolecciondatosbackend.Servicios.PlatoService;
import com.recolecciondatosbackend.Servicios.PrecioService;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Precio;
import com.recolecciondatosbackend.repositorios.PrecioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PrecioServiceImpl implements PrecioService {

    @Autowired
    PrecioRepository precioRepository;

    @Autowired
    PlatoService platoService;

    @Autowired
    PeriodoService periodoService;
    @Override
    public ResponseEntity<?> crearPrecio(int precio, int idPlato, int idPeriodo) {
        try{
            Plato plato = platoService.getPlatoById(idPlato);
            Periodo periodo = periodoService.getPeriodoById(idPeriodo);
            Precio precioNuevo = new Precio(periodo, plato, precio);
            precioRepository.save(precioNuevo);
            return ResponseEntity.status(HttpStatus.CREATED).body("El precio del plato " + plato.getNombre() + " ha sido creado correctamente.");

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el Precio del plato");
        }
    }
}
