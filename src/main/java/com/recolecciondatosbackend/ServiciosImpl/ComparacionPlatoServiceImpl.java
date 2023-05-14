package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.comparacionPlatoDTO;
import com.recolecciondatosbackend.Servicios.ComparacionPlatoService;
import com.recolecciondatosbackend.Servicios.PlatoCompetenciaService;
import com.recolecciondatosbackend.Servicios.PlatoService;
import com.recolecciondatosbackend.Servicios.periodoService;
import com.recolecciondatosbackend.modelos.ComparacionPlato;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import com.recolecciondatosbackend.repositorios.ComparacionPlatoRepository;
import com.recolecciondatosbackend.repositorios.PlatoCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ComparacionPlatoServiceImpl implements ComparacionPlatoService {

    @Autowired
    private ComparacionPlatoRepository comparacionPlatoRepository;

    @Autowired
    private PlatoService platoService;

    @Autowired
    private PlatoCompetenciaService platoCompetenciaService;

    @Autowired
    private PlatoCompetenciaRepository platoCompetenciaRepository;

    @Autowired
    private periodoService PeriodoService;

    @Override
    public ResponseEntity<?> crearComparacion(comparacionPlatoDTO ComparacionPlatoDTO) {
        try {
            Plato platoUAO = platoService.getPlatoById(ComparacionPlatoDTO.getIdPlatoUAO());
            PlatoCompetencia platoCompetencia = platoCompetenciaRepository.save(ComparacionPlatoDTO.getPlatoCompetencia());
            Periodo periodo = PeriodoService.getPeriodoById(ComparacionPlatoDTO.getIdPeriodo());
            ComparacionPlato comparacionPlato = new ComparacionPlato(platoUAO, platoCompetencia, periodo, ComparacionPlatoDTO.getFechaComparacion(), ComparacionPlatoDTO.getResponsableProceso(), ComparacionPlatoDTO.getResponsableCargue());
            comparacionPlatoRepository.save(comparacionPlato);
            return ResponseEntity.status(HttpStatus.CREATED).body("La comparacion entre los platos " + comparacionPlato.getPlatoUAO().getNombre() + " y " + comparacionPlato.getPlatoCompetencia().getNombre() + " fue creada con exito");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error guardando la comparación de los platos " + e);
        }
    }
}
