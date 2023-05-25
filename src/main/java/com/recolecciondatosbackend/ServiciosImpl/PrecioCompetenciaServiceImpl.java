package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.PeriodoService;
import com.recolecciondatosbackend.Servicios.PlatoCompetenciaService;
import com.recolecciondatosbackend.Servicios.PrecioCompetenciaService;
import com.recolecciondatosbackend.modelos.*;
import com.recolecciondatosbackend.repositorios.PrecioCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PrecioCompetenciaServiceImpl implements PrecioCompetenciaService {

    @Autowired
    PlatoCompetenciaService platoCompetenciaService;

    @Autowired
    PeriodoService periodoService;

    @Autowired
    PrecioCompetenciaRepository precioCompetenciaRepository;

    @Override
    public ResponseEntity<?> crearPrecioCompetencia(int precio, int idPlatoCompetencia, int idPeriodo) {
        try{
            PlatoCompetencia platoCompetencia = platoCompetenciaService.getPlatoCompetenciaById(idPlatoCompetencia);
            Periodo periodo = periodoService.getPeriodoById(idPeriodo);
            PrecioCompetencia precioNuevo = new PrecioCompetencia();
            precioNuevo.setPrecio(precio);
            precioNuevo.setPlatoCompetencia(platoCompetencia);
            precioNuevo.setPeriodo(periodo);
            precioCompetenciaRepository.save(precioNuevo);
            return ResponseEntity.status(HttpStatus.CREATED).body("El precio del plato " + platoCompetencia.getNombre() + " ha sido creado correctamente.");

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el Precio del plato competencia");
        }
    }
}
