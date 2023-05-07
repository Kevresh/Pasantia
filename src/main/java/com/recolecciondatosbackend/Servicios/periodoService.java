package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.periodoDTO;
import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;

import java.util.List;

public interface periodoService {
    List<periodoDTO> obtenerPeriodo();
}
