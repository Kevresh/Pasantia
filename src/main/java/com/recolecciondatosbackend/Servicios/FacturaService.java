package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.facturaDTO;
import com.recolecciondatosbackend.modelos.Factura;
import org.springframework.http.ResponseEntity;

public interface FacturaService {

    ResponseEntity<?> crearRegistroCompetetividadValorGenerado(facturaDTO factura);

}
