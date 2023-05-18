package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.Material;

import java.util.List;

public interface MaterialService {
    List<Material> obtenerResiduos();

    Material getResiduoById(int id);

}
