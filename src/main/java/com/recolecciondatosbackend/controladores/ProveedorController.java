package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.facturaDTO;
import com.recolecciondatosbackend.Servicios.ProveedorService;
import com.recolecciondatosbackend.modelos.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin(origins = "http://localhost:3000/")
public class ProveedorController {
    @Autowired
    ProveedorService proveedorService;

    @GetMapping("/obtenerProveedores")
    public ResponseEntity<?> obtenerTodosLosProveedores() {
        try{
            List<Proveedor> proveedores =proveedorService.obtenerProveedores();
            return ResponseEntity.ok(proveedores);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo restaurantes " + e);
        }
    }
}
