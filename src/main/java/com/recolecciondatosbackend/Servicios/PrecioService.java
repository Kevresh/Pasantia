package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.Precio;
import org.springframework.http.ResponseEntity;

public interface PrecioService {

    ResponseEntity<?> crearPrecio(int precio, int idPlato, int idPeriodo);

}
