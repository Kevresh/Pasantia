package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.Factura;
import org.springframework.http.ResponseEntity;

public interface FacturaService {

    ResponseEntity<?> crearRegistroCompetetividadValorGenerado(Factura factura);

}
