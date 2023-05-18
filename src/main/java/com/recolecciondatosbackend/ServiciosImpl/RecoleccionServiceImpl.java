package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.recoleccionDTO;
import com.recolecciondatosbackend.Servicios.PeriodoService;
import com.recolecciondatosbackend.Servicios.RecoleccionService;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Recoleccion;
import com.recolecciondatosbackend.repositorios.RecoleccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecoleccionServiceImpl implements RecoleccionService {

    @Autowired
    RecoleccionRepository recoleccionRepository;

    @Autowired
    PeriodoService periodoService;

    @Override
    public Recoleccion crearRecoleccion(recoleccionDTO RecoleccionDTO) {
        Periodo periodo = periodoService.getPeriodoById(RecoleccionDTO.getIdPeriodo());

        Recoleccion recoleccion = new Recoleccion(periodo,
                RecoleccionDTO.getFecha(),
                RecoleccionDTO.getResponsableProceso(),
                RecoleccionDTO.getResponsableCargue(),
                RecoleccionDTO.getNoFacturaVenta());
        return recoleccionRepository.save(recoleccion);
    }
}
