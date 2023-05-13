package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {
}
