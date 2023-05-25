package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Restaurante;
import com.recolecciondatosbackend.modelos.RestauranteCompetencia;
import com.recolecciondatosbackend.modelos.UniversidadCompetencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestauranteCompetenciaRepository extends JpaRepository<RestauranteCompetencia, Integer> {

    List<RestauranteCompetencia> findAllByUniversidadCompetencia(UniversidadCompetencia universidadCompetencia);


}
