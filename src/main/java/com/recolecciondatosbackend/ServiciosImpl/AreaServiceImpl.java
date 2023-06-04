package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.areasDTO;
import com.recolecciondatosbackend.DTO.preguntasDTO;
import com.recolecciondatosbackend.Servicios.AreaService;
import com.recolecciondatosbackend.modelos.Areas;
import com.recolecciondatosbackend.modelos.Preguntas;
import com.recolecciondatosbackend.repositorios.AreaRepository;
import com.recolecciondatosbackend.repositorios.PreguntasRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    AreaRepository areaRepository;

    @Autowired
    PreguntasRepository preguntasRepository;

    @Override
    public List<Areas> obtenerTodasLasAreas() {
        return areaRepository.findAll();
    }
    @Override
    public List<areasDTO> obtenerAreasConPreguntas() {
        List<Areas> areas = obtenerTodasLasAreas();
        List<areasDTO> areaDTO = new ArrayList<>();
        for (Areas area : areas) {
            areasDTO AreasDTO = new areasDTO();
            AreasDTO.setIdArea(area.getIdArea());
            AreasDTO.setNombre(area.getNombre());
            AreasDTO.setFecha(area.getFecha());
            List<Preguntas> preguntas = preguntasRepository.findAllByArea(area);
            if (preguntas != null && !preguntas.isEmpty()) {
                List<preguntasDTO> PreguntasDTO = new ArrayList<>();
                for (Preguntas pregunta : preguntas) {
                    preguntasDTO PreguntaDTO = new preguntasDTO(pregunta.getIdPregunta(),pregunta.getIdArea(),pregunta.getNombre());

                    PreguntasDTO.add(PreguntaDTO);
                }
                AreasDTO.setPreguntas(PreguntasDTO);
            }
            areaDTO.add(AreasDTO);
        }
        return areaDTO;
    }

    @Override
    public areasDTO obtenerPreguntasConIdArea(int idArea) {
        Optional<Areas> areaOptional = areaRepository.findById(idArea);
        if (areaOptional.isPresent()) {
            Areas area = areaOptional.get();
            areasDTO areaDTO = new areasDTO();
            areaDTO.setIdArea(area.getIdArea());
            areaDTO.setNombre(area.getNombre());
            areaDTO.setFecha(area.getFecha());

            List<Preguntas> preguntas = preguntasRepository.findAllByArea(area);
            if (preguntas != null && !preguntas.isEmpty()) {
                List<preguntasDTO> preguntasDTO = new ArrayList<>();
                for (Preguntas pregunta : preguntas) {
                    preguntasDTO preguntaDTO = new preguntasDTO(pregunta.getIdPregunta(), pregunta.getIdArea(), pregunta.getNombre());
                    preguntasDTO.add(preguntaDTO);
                }
                areaDTO.setPreguntas(preguntasDTO);
            }

            return areaDTO;
        } else {
            return null;
        }
    }
}
