package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoRepository extends JpaRepository<Contrato, Integer> {
}
