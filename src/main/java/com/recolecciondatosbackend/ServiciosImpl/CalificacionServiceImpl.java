package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.calificacionDTO;
import com.recolecciondatosbackend.Servicios.CalificacionService;
import com.recolecciondatosbackend.modelos.Calificacion;
import com.recolecciondatosbackend.repositorios.CalificacionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalificacionServiceImpl implements CalificacionService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    CalificacionRepository calificacionRepository;
    @Override
    public List<calificacionDTO> obtenerCalificaciones() {
        List<Calificacion> calificaciones = calificacionRepository.findAll();
        return calificaciones.stream()
                .map(calificacion -> modelMapper.map(calificacion, calificacionDTO.class))
                .collect(Collectors.toList());
    }
}
