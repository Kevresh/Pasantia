package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.materialDTO;
import com.recolecciondatosbackend.DTO.tipoResiduoConMaterialDTO;
import com.recolecciondatosbackend.Servicios.TipoResiduoService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Material;
import com.recolecciondatosbackend.modelos.TipoResiduo;
import com.recolecciondatosbackend.repositorios.MaterialRepository;
import com.recolecciondatosbackend.repositorios.TipoResiduoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TipoResiduoServiceImpl implements TipoResiduoService {

    @Autowired
    TipoResiduoRepository tipoResiduoRepository;

    @Autowired
    MaterialRepository materialRepository;

    @Override
    public List<tipoResiduoConMaterialDTO> getMaterialesPorTipoResiduo() {
        List<TipoResiduo> tiposResiduo = tipoResiduoRepository.findAll();
        List<tipoResiduoConMaterialDTO> tiposResiduoConMaterialDTO = new ArrayList<>();

        for (TipoResiduo tipoResiduo : tiposResiduo) {
            tipoResiduoConMaterialDTO tipoResiduoDTO = new tipoResiduoConMaterialDTO();
            tipoResiduoDTO.setIdTipoResiduo(tipoResiduo.getIdTipoResiduo());
            tipoResiduoDTO.setNombre(tipoResiduo.getNombre());

            List<Material> materiales = materialRepository.findByTipoResiduo(tipoResiduo);
            List<materialDTO> materialesDTO = new ArrayList<>();

            for (Material material : materiales) {
                materialDTO materialDTO = new materialDTO();
                materialDTO.setIdMaterial(material.getIdMaterial());
                materialDTO.setNombre(material.getNombre());
                materialesDTO.add(materialDTO);
            }

            tipoResiduoDTO.setMaterial(materialesDTO);
            tiposResiduoConMaterialDTO.add(tipoResiduoDTO);
        }

        return tiposResiduoConMaterialDTO;
    }

    @Override
    public tipoResiduoConMaterialDTO getMaterialesPorIdTipoResiduo(int idTipoResiduo) {
        Optional<TipoResiduo> tipoResiduoOptional = tipoResiduoRepository.findById(idTipoResiduo);
        if (tipoResiduoOptional.isPresent()) {
            TipoResiduo tipoResiduo = tipoResiduoOptional.get();
            tipoResiduoConMaterialDTO tipoResiduoDTO = new tipoResiduoConMaterialDTO();
            tipoResiduoDTO.setIdTipoResiduo(tipoResiduo.getIdTipoResiduo());
            tipoResiduoDTO.setNombre(tipoResiduo.getNombre());

            List<Material> materiales = materialRepository.findByTipoResiduo(tipoResiduo);
            List<materialDTO> materialesDTO = new ArrayList<>();

            for (Material material : materiales) {
                materialDTO materialDTO = new materialDTO();
                materialDTO.setIdMaterial(material.getIdMaterial());
                materialDTO.setNombre(material.getNombre());
                materialesDTO.add(materialDTO);
            }

            tipoResiduoDTO.setMaterial(materialesDTO);
            return tipoResiduoDTO;
        } else {
            return null;
        }
    }

    @Override
    public TipoResiduo getTipoResiduoById(int id) {
        return tipoResiduoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el tipo residuo con el id " + id));
    }
}
