package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.facturaDTO;
import com.recolecciondatosbackend.Servicios.*;
import com.recolecciondatosbackend.modelos.*;
import com.recolecciondatosbackend.repositorios.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    ServicioService servicioService;

    @Autowired
    com.recolecciondatosbackend.Servicios.PeriodoService PeriodoService;

    @Autowired
    FacturaRepository facturaRepository;

    @Autowired
    ProveedorService proveedorService;

    @Override
    public ResponseEntity<?> crearRegistroCompetetividadValorGenerado(facturaDTO FacturaDTO) {
        try {
            Periodo periodo = PeriodoService.getPeriodoById(FacturaDTO.getIdPeriodo());

            Servicio servicio = servicioService.getServicioById(FacturaDTO.getIdServicio());

            Proveedor proveedor = proveedorService.getProveedorById(FacturaDTO.getIdProveedor());

            Factura factura = new Factura();
            factura.setFechaCargue(FacturaDTO.getFechaCargue());
            factura.setFechaFacturacion(FacturaDTO.getFechaFacturacion());
            factura.setCobro(FacturaDTO.getCobro());
            factura.setProveedor(proveedor);
            factura.setPeriodo(periodo);
            factura.setServicio(servicio);
            factura.setNumeroFactura(FacturaDTO.getNumeroFactura());

            facturaRepository.save(factura);

            return ResponseEntity.status(HttpStatus.CREATED).body("El registro de competitividad se ha creado correctamente");
        } catch (HttpMessageNotReadableException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al procesar la solicitud: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error guardando el formulario");
        }
    }
}
