package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.DTO.restauranteDTO;
import com.recolecciondatosbackend.DTO.tipoResiduoConMaterialDTO;
import com.recolecciondatosbackend.Servicios.TipoResiduoService;
import com.recolecciondatosbackend.modelos.TipoResiduo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiporesiduo")
@CrossOrigin(origins = "http://localhost:3000/")
public class TipoResiduoController {

    @Autowired
    TipoResiduoService tipoResiduoService;

    @GetMapping("/obtenerMaterialesPorTipoResiduo")
    public ResponseEntity<?> getMaterialesPorTipoResiduo() {
        try {
            List<tipoResiduoConMaterialDTO> tiposResiduo = tipoResiduoService.getMaterialesPorTipoResiduo();
            return ResponseEntity.ok(tiposResiduo);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo los tipos de residuo y materiales");
        }
    }

    @GetMapping("/obtenerMaterialesPorIdTipoResiduo/{idTipoResiduo}")
    public ResponseEntity<?> getMaterialesPorIdTipoResiduo(@PathVariable("idTipoResiduo") int idTipoResiduo) {
        try {
            tipoResiduoConMaterialDTO tipoResiduo = tipoResiduoService.getMaterialesPorIdTipoResiduo(idTipoResiduo);
            if (tipoResiduo != null) {
                return ResponseEntity.ok(tipoResiduo);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error obteniendo el tipo de residuo y sus materiales");
        }
    }

}
