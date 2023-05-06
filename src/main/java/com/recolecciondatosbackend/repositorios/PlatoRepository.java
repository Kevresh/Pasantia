package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatoRepository extends JpaRepository<Plato, Integer> {
}
