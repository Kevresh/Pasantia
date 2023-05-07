package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Integer> {
}
