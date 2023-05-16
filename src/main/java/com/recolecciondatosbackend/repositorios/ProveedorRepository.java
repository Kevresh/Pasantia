package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}
