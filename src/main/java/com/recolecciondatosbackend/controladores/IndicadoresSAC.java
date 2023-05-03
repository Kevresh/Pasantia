package com.recolecciondatosbackend.controladores;

import com.recolecciondatosbackend.Servicios.ServiceSAC;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/indicadoresSAC")
public class IndicadoresSAC {

    @Autowired
    private ServiceSAC serviceSac;

    @PostMapping("/platoUao")
    public ResponseEntity<Plato> createPlato(@RequestBody Plato plato) {
        Plato createdPlato = serviceSac.crearPlato(plato);
        if (createdPlato == null) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity<>(createdPlato, HttpStatus.CREATED);
        }
    }


}
