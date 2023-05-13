package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.periodoDTO;
import com.recolecciondatosbackend.DTO.restauranteBasicoDTO;
import com.recolecciondatosbackend.modelos.Periodo;

import java.util.List;

public interface periodoService {
    List<periodoDTO> obtenerPeriodo();

    Periodo getPeriodoById(int id);
}
