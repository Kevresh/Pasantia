package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Recoleccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecoleccionRepository extends JpaRepository<Recoleccion, Integer> {
}
