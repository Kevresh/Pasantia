package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Precio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PrecioRepository extends JpaRepository<Precio, Integer> {
    Optional<Precio> findByPlatoAndPeriodo(Plato plato, Periodo periodo);

}
