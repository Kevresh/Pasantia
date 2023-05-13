package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.periodoDTO;
import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;
import com.recolecciondatosbackend.Servicios.periodoService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Restaurante;
import com.recolecciondatosbackend.repositorios.PeriodoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeriodoServiceImpl implements periodoService {

    @Autowired
    PeriodoRepository periodoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<periodoDTO> obtenerPeriodo() {
        List<Periodo> periodos = periodoRepository.findAll();
        return periodos.stream()
                .map(periodo -> modelMapper.map(periodo, periodoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public Periodo getPeriodoById(int id){
        return periodoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el periodo con el id " + id));
    }
}
