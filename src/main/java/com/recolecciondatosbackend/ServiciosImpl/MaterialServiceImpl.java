package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.materialDTO;
import com.recolecciondatosbackend.Servicios.MaterialService;
import com.recolecciondatosbackend.Servicios.TipoResiduoService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Material;
import com.recolecciondatosbackend.modelos.Proveedor;
import com.recolecciondatosbackend.modelos.TipoResiduo;
import com.recolecciondatosbackend.repositorios.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialRepository materialRepository;

    @Autowired
    TipoResiduoService tipoResiduoService;

    @Override
    public List<Material> obtenerResiduos() {
        return materialRepository.findAll();
    }

    @Override
    public Material getResiduoById(int id) {
        return materialRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("No existe el residuo con el id " + id));
    }

    @Override
    public ResponseEntity<?> crearMaterial(materialDTO MaterialDTO) {
        try{
            TipoResiduo tipoResiduo = tipoResiduoService.getTipoResiduoById(MaterialDTO.getIdMaterial());

            Material material = new Material();
            material.setTipoResiduo(tipoResiduo);
            material.setNombre(MaterialDTO.getNombre());

            materialRepository.save(material);


            return ResponseEntity.status(HttpStatus.CREATED).body("El material " + material.getNombre() + " ha sido creado correctamente.");

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el material");
        }
    }
}
