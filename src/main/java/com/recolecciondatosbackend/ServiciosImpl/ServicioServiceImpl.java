package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.ServicioService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Servicio;
import com.recolecciondatosbackend.repositorios.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    ServicioRepository servicioRepository;

    @Override
    public Servicio crearServicio(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @Override
    public Servicio getServicioById(int id) {
        return servicioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el periodo con el id " + id));
    }
}
