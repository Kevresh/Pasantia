package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.proveedorDTO;
import com.recolecciondatosbackend.Servicios.ProveedorService;
import com.recolecciondatosbackend.excepciones.ResourceNotFoundException;
import com.recolecciondatosbackend.modelos.Proveedor;
import com.recolecciondatosbackend.repositorios.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;
    @Override
    public Proveedor getProveedorById(int id) {
        return proveedorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el proveedor con el id " + id));
    }

    @Override
    public ResponseEntity<?> crearProveedor(proveedorDTO ProveedorDTO) {
        try{
            Proveedor proveedor = new Proveedor();
            proveedor.setNombre(ProveedorDTO.getNombre());
            proveedorRepository.save(proveedor);

            return ResponseEntity.status(HttpStatus.CREATED).body("El proveedor " + proveedor.getNombre() + " ha sido creado correctamente.");

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio un Error Guardando el proveedor");
        }

    }

    @Override
    public List<Proveedor> obtenerProveedores() {
        return proveedorRepository.findAll();
    }
}
