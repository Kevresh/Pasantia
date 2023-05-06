package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.http.ResponseEntity;

public interface PlatoService {
    public ResponseEntity<?> crearPlato(Plato plato);
}
