package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.DetalleRecoleccion;
import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleRecoleccionPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleRecoleccionRepository extends JpaRepository<DetalleRecoleccion, DetalleRecoleccionPK> {
}
