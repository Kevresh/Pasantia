package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.MaterialService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Material;
import com.recolecciondatosbackend.repositorios.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialRepository materialRepository;

    @Override
    public List<Material> obtenerResiduos() {
        return materialRepository.findAll();
    }

    @Override
    public Material getResiduoById(int id) {
        return materialRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("No existe el residuo con el id " + id));
    }
}
