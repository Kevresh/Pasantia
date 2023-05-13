package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.calificacionDTO;

import java.util.List;

public interface CalificacionService {

    List<calificacionDTO> obtenerCalificaciones();
}
