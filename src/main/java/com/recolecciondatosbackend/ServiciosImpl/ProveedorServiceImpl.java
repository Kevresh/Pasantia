package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.ProveedorService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Proveedor;
import com.recolecciondatosbackend.repositorios.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;
    @Override
    public Proveedor getProveedorById(int id) {
        return proveedorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el proveedor con el id " + id));
    }
}
