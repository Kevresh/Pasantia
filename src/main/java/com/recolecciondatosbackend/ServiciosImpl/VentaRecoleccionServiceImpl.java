package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.ventaRecoleccionDTO;
import com.recolecciondatosbackend.Servicios.MaterialService;
import com.recolecciondatosbackend.Servicios.VentaRecoleccionService;
import com.recolecciondatosbackend.modelos.*;
import com.recolecciondatosbackend.repositorios.VentaRecoleccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VentaRecoleccionServiceImpl implements VentaRecoleccionService {

    @Autowired
    MaterialService materialService;

    @Autowired
    VentaRecoleccionRepository ventaRecoleccionRepository;
    @Override
    public ResponseEntity<?> crearVentaRecoleccion(ventaRecoleccionDTO VentaRecoleccionDTO) {
        try {
            Material material = materialService.getResiduoById(VentaRecoleccionDTO.getIdResiduo());
            VentaRecoleccion ventaRecoleccion = new VentaRecoleccion(material,VentaRecoleccionDTO.getFechaFactura(), VentaRecoleccionDTO.getTotalKg(), VentaRecoleccionDTO.getValorUnitario(), VentaRecoleccionDTO.getResponsableCarga(), VentaRecoleccionDTO.getResponsableProceso());
            ventaRecoleccionRepository.save(ventaRecoleccion);
            return ResponseEntity.status(HttpStatus.CREATED).body("El formulario fue guardado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error guardando el formulario " + e);
        }
    }
}
