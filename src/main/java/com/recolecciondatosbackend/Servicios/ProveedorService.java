package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.Proveedor;

import java.util.List;

public interface ProveedorService {

    Proveedor getProveedorById(int id);
    List<Proveedor> obtenerProveedores();
}
