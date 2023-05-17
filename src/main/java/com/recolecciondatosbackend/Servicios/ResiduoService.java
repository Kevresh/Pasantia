package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.Residuo;

import java.util.List;

public interface ResiduoService {
    List<Residuo> obtenerResiduos();

    Residuo getResiduoById(int id);

}
