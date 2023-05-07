package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlatoRepository extends JpaRepository<Plato, Integer> {
    List<Plato> findAllByRestaurante(Restaurante restaurante);
}
