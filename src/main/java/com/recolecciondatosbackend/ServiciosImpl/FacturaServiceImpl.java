package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.FacturaService;
import com.recolecciondatosbackend.modelos.Factura;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl implements FacturaService {
    @Override
    public ResponseEntity<?> crearRegistroCompetetividadValorGenerado(Factura factura) {
        return null;
    }
}
