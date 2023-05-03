package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioSac extends JpaRepository<Plato, Integer> {
}
