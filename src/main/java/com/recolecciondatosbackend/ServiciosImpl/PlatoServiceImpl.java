package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.Servicios.PlatoService;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.repositorios.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlatoServiceImpl implements PlatoService {

    @Autowired
    private PlatoRepository platoRepository;

    @Override
    public ResponseEntity<?> crearPlato(Plato plato) {
        try{
            platoRepository.save(plato);
            return ResponseEntity.status(HttpStatus.CREATED).body("El plato " + plato.getNombre() + " ha sido creado correctamente.");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el plato");
        }
    }
}
