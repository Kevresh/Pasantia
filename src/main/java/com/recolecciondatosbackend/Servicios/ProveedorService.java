package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.proveedorDTO;
import com.recolecciondatosbackend.modelos.Proveedor;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProveedorService {

    Proveedor getProveedorById(int id);

    ResponseEntity<?> crearProveedor(proveedorDTO ProveedorDTO);

    List<Proveedor> obtenerProveedores();
}
