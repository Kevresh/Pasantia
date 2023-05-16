package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.ContratoService;
import com.recolecciondatosbackend.modelos.Contrato;
import com.recolecciondatosbackend.repositorios.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratoServiceImpl implements ContratoService {

    @Autowired
    ContratoRepository contratoRepository;

    @Override
    public Contrato crearContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }
}
