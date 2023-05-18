package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.detalleEvaluacionDTO;
import com.recolecciondatosbackend.DTO.detalleRecoleccionDTO;
import com.recolecciondatosbackend.DTO.recoleccionDTO;
import com.recolecciondatosbackend.Servicios.DetalleRecoleccionService;
import com.recolecciondatosbackend.Servicios.MaterialService;
import com.recolecciondatosbackend.Servicios.RecoleccionService;
import com.recolecciondatosbackend.modelos.DetalleEvaluacion;
import com.recolecciondatosbackend.modelos.DetalleRecoleccion;
import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleEvaluacionPK;
import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleRecoleccionPK;
import com.recolecciondatosbackend.modelos.Recoleccion;
import com.recolecciondatosbackend.repositorios.DetalleRecoleccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleRecoleccionServiceImpl implements DetalleRecoleccionService {

    @Autowired
    RecoleccionService recoleccionService;

    @Autowired
    DetalleRecoleccionRepository detalleRecoleccionRepository;

    @Autowired
    MaterialService materialService;

    @Override
    public ResponseEntity<?> crearDetalleRecoleccion(List<detalleRecoleccionDTO> DetalleRecoleccionDTO) {
        try{
            recoleccionDTO recolecciondto = DetalleRecoleccionDTO.get(0).getRecoleccion();
            Recoleccion recoleccion = recoleccionService.crearRecoleccion(recolecciondto);

            for (detalleRecoleccionDTO detallesRecoleccionDTO : DetalleRecoleccionDTO) {
                DetalleRecoleccion detalleRecoleccion = new DetalleRecoleccion();

                detalleRecoleccion.setId(new DetalleRecoleccionPK(recoleccion.getIdRecoleccion(), detallesRecoleccionDTO.getIdMaterial()));
                detalleRecoleccion.setCantidad(detallesRecoleccionDTO.getCantidad());
                detalleRecoleccion.setValorUnidad(detallesRecoleccionDTO.getValorUnidad());

                detalleRecoleccionRepository.save(detalleRecoleccion);
            }
            return ResponseEntity.status(HttpStatus.CREATED).body("La recoleccion se ha creado correctamente");
        }catch (HttpMessageNotReadableException e) {
            // excepción al deserializar el JSON
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al procesar la solicitud: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error guardando el formulario " + e.getMessage());
        }
    }
}
