package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Areas;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.Preguntas;
import com.recolecciondatosbackend.modelos.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreguntasRepository extends JpaRepository<Preguntas, Integer> {

    List<Preguntas> findAllByArea(Areas areas);


}
