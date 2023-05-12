package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.DetalleEvaluacion;
import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleEvaluacionPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleEvaluacionRepository extends JpaRepository<DetalleEvaluacion, DetalleEvaluacionPK> {
}
