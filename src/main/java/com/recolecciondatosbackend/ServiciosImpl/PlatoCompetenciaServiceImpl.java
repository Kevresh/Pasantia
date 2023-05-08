package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.PlatoCompetenciaService;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import com.recolecciondatosbackend.repositorios.PlatoCompetenciaRepository;
import com.recolecciondatosbackend.repositorios.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlatoCompetenciaServiceImpl implements PlatoCompetenciaService {

    @Autowired
    private PlatoCompetenciaRepository platoCompetenciaRepository;

    @Override
    public ResponseEntity<?> crearPlatoCompetencia(PlatoCompetencia plato) {
        try{
            platoCompetenciaRepository.save(plato);
            return ResponseEntity.status(HttpStatus.CREATED).body("El plato de la competencia " + plato.getNombre() + " ha sido creado correctamente.");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el Plato");
        }
    }
}
