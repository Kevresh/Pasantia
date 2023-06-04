package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.PrecioCompetencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrecioCompetenciaRepository extends JpaRepository<PrecioCompetencia, Integer> {
}
