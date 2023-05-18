package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.preguntasDTO;
import com.recolecciondatosbackend.Servicios.PreguntasService;
import com.recolecciondatosbackend.modelos.Preguntas;
import com.recolecciondatosbackend.repositorios.PreguntasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PreguntasServiceImpl implements PreguntasService {

    @Autowired
    PreguntasRepository preguntasRepository;

    @Override
    public List<preguntasDTO> obtenerPreguntasPorArea(int idArea) {
        List<Preguntas> preguntas = preguntasRepository.findByAreaIdArea(idArea);
        List<preguntasDTO> PreguntasDTO = preguntas.stream()
                .map(this::convertirAPreguntasDTO)
                .collect(Collectors.toList());
        return PreguntasDTO;
    }

    private preguntasDTO convertirAPreguntasDTO(Preguntas pregunta) {
        preguntasDTO preguntaDTO = new preguntasDTO();
        preguntaDTO.setIdPunto(pregunta.getIdPregunta());
        preguntaDTO.setNombre(pregunta.getNombre());
        return preguntaDTO;
    }
}
