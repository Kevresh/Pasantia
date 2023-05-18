package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.areasDTO;
import com.recolecciondatosbackend.DTO.preguntasDTO;
import com.recolecciondatosbackend.modelos.Areas;

import java.util.List;

public interface AreaService {

    List<Areas> obtenerTodasLasAreas();

    List<areasDTO> obtenerAreasConPreguntas();

}
