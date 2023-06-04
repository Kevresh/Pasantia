package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.materialDTO;
import com.recolecciondatosbackend.DTO.proveedorDTO;
import com.recolecciondatosbackend.Servicios.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/material")
@CrossOrigin(origins = "http://localhost:3000/")
public class MaterialController {

    @Autowired
    MaterialService materialService;

    @PostMapping("/crearMaterial")
    public ResponseEntity<?> crearMaterial(@RequestBody materialDTO MaterialDTO) {
        return materialService.crearMaterial(MaterialDTO);
    }

}
