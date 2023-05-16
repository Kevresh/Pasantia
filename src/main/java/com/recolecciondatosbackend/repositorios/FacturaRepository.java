package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.Servicios.FacturaService;
import com.recolecciondatosbackend.modelos.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {
}
