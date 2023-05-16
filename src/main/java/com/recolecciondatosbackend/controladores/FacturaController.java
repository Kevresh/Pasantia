package com.recolecciondatosbackend.controladores;


import com.recolecciondatosbackend.DTO.facturaDTO;
import com.recolecciondatosbackend.Servicios.FacturaService;
import com.recolecciondatosbackend.modelos.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factura")
@CrossOrigin(origins = "http://localhost:3000/")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping("/crearRegistroCompetetividadValorGenerado")
    public ResponseEntity<?> crearRegistroCompetetividadValorGenerado(@RequestBody facturaDTO FacturaDTO) {
        Factura factura = new Factura(FacturaDTO.getIdFactura(), FacturaDTO.getContrato(), FacturaDTO.getPeriodo(), FacturaDTO.getServicio(), FacturaDTO.getFecha(), FacturaDTO.getOrdenServicio());
        return facturaService.crearRegistroCompetetividadValorGenerado(factura);
    }

}
