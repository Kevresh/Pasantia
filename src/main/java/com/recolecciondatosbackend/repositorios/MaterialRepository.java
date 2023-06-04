package com.recolecciondatosbackend.repositorios;

import com.recolecciondatosbackend.modelos.Material;
import com.recolecciondatosbackend.modelos.TipoResiduo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
    List<Material> findByTipoResiduo(TipoResiduo tipoResiduo);
}
