package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.preguntasDTO;

import java.util.List;

public interface PreguntasService {
    List<preguntasDTO> obtenerPreguntasPorArea(int idArea);
}
