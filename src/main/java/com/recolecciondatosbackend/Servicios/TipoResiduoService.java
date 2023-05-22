package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.DTO.tipoResiduoConMaterialDTO;
import com.recolecciondatosbackend.modelos.TipoResiduo;

import java.util.List;

public interface TipoResiduoService {

    List<tipoResiduoConMaterialDTO> getMaterialesPorTipoResiduo();

    tipoResiduoConMaterialDTO getMaterialesPorIdTipoResiduo(int idTipoResiduo);

    TipoResiduo getTipoResiduoById(int id);
}
