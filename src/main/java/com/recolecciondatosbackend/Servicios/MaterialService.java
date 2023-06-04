package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.materialDTO;
import com.recolecciondatosbackend.modelos.Material;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MaterialService {
    List<Material> obtenerResiduos();

    Material getResiduoById(int id);

    ResponseEntity<?> crearMaterial(materialDTO MaterialDTO);

}
