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
    ContratoService contratoService;

    @Autowired
    ServicioService servicioService;

    @Autowired
    periodoService PeriodoService;

    @Autowired
    FacturaRepository facturaRepository;

    @Autowired
    ProveedorService proveedorService;

    @Override
    public ResponseEntity<?> crearRegistroCompetetividadValorGenerado(facturaDTO FacturaDTO) {
        try {

            //Creamos la instancia de contrato para guardarla en la base de datos
            Contrato contrato = new Contrato();
            contrato.setIdContrato(FacturaDTO.getContrato().getIdContrato());
            contrato.setFechaContrato(FacturaDTO.getContrato().getFechaContrato());
            contrato.setValor(FacturaDTO.getContrato().getValor());
            //Creamos el contrato
            contratoService.crearContrato(contrato);

            Periodo periodo = PeriodoService.getPeriodoById(FacturaDTO.getIdPeriodo());

            //Creamos la instancia de servicio para guardarla en la base de datos
            Servicio servicio = new Servicio();

            Proveedor proveedor = proveedorService.getProveedorById(FacturaDTO.getServicio().getIdProveedor());
            servicio.setProveedor(proveedor);

            servicio.setTipoServicio(FacturaDTO.getServicio().getTipoServicio());
            servicio.setCobro(FacturaDTO.getServicio().getCobro());
            //Creamos el servicio
            servicioService.crearServicio(servicio);

            Factura factura = new Factura();
            factura.setIdFactura(FacturaDTO.getIdFactura());
            factura.setContrato(contrato);
            factura.setPeriodo(periodo);
            factura.setServicio(servicio);
            factura.setFecha(FacturaDTO.getFecha());
            factura.setOrdenServicio(FacturaDTO.getOrdenServicio());

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
