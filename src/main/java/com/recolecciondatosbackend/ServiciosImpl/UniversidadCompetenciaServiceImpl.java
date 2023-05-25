package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.UniversidadCompetenciaService;
import com.recolecciondatosbackend.modelos.UniversidadCompetencia;
import com.recolecciondatosbackend.repositorios.UniversidadCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UniversidadCompetenciaServiceImpl implements UniversidadCompetenciaService {
    @Autowired
    UniversidadCompetenciaRepository universidadCompetenciaRepository;

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
}
