package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.EvCalidadService;
import com.recolecciondatosbackend.modelos.EvCalidad;
import com.recolecciondatosbackend.repositorios.EvCalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvCalidadServiceImpl implements EvCalidadService {

    @Autowired
    EvCalidadRepository evCalidadRepository;

    @Override
    public EvCalidad crearEvCalidad(EvCalidad evCalidad) {
        return evCalidadRepository.save(evCalidad);
    }
}
