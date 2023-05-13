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
    private periodoService PeriodoService;

    @Override
    public ResponseEntity<?> crearComparacion(comparacionPlatoDTO ComparacionPlatoDTO) {
        try {
            Plato platoUAO = platoService.getPlatoById(ComparacionPlatoDTO.getIdPlatoUAO());
            PlatoCompetencia platoCompetencia = platoCompetenciaService.getPlatoCompetenciaById(ComparacionPlatoDTO.getIdPlatoCompetencia());
            Periodo periodo = PeriodoService.getPeriodoById(ComparacionPlatoDTO.getIdPeriodo());
            ComparacionPlato comparacionPlato = new ComparacionPlato(platoUAO, platoCompetencia, periodo, ComparacionPlatoDTO.getFechaComparacion(), ComparacionPlatoDTO.getResponsableProceso(), ComparacionPlatoDTO.getResponsableCargue());
            return ResponseEntity.ok().body(comparacionPlatoRepository.save(comparacionPlato));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error guardando la comparación de los platos");
        }
    }
}