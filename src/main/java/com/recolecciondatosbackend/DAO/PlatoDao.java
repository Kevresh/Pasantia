package com.recolecciondatosbackend.DAO;

import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoDao extends JpaRepository<Plato, Integer> {
}
