package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {
}
