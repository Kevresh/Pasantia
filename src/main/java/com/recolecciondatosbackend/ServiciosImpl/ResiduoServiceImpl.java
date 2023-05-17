package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.ResiduoService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Residuo;
import com.recolecciondatosbackend.repositorios.ResiduoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResiduoServiceImpl implements ResiduoService {

    @Autowired
    ResiduoRepository residuoRepository;

    @Override
    public List<Residuo> obtenerResiduos() {
        return residuoRepository.findAll();
    }

    @Override
    public Residuo getResiduoById(int id) {
        return residuoRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("No existe el residuo con el id " + id));
    }
}
