package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.VentaRecoleccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRecoleccionRepository extends JpaRepository<VentaRecoleccion, Integer> {
}
