package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.periodoDTO;
import com.recolecciondatosbackend.modelos.Periodo;

import java.util.List;

public interface PeriodoService {
    List<periodoDTO> obtenerPeriodo();

    Periodo getPeriodoById(int id);
}
