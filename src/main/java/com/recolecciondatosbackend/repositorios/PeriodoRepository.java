package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodoRepository extends JpaRepository<Periodo, Integer> {
}
