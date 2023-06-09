package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DTO.detalleEvaluacionDTO;
import com.recolecciondatosbackend.Servicios.DetalleEvaluacionService;
import com.recolecciondatosbackend.Servicios.EvCalidadService;
import com.recolecciondatosbackend.modelos.DetalleEvaluacion;
import com.recolecciondatosbackend.modelos.EvCalidad;
import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleEvaluacionPK;
import com.recolecciondatosbackend.repositorios.DetalleEvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetalleEvaluacionServiceImpl implements DetalleEvaluacionService {

    @Autowired
    DetalleEvaluacionRepository detalleEvaluacionRepository;

    @Autowired
    EvCalidadService evCalidadService;

    @Override
    public ResponseEntity<?> crearDetalleEvaluacion(List<detalleEvaluacionDTO> DetallesEvaluacionesDTO) {
        try{
            EvCalidad evCalidad = DetallesEvaluacionesDTO.get(0).getEvCalidad();
            evCalidadService.crearEvCalidad(evCalidad);
            for (detalleEvaluacionDTO detalleEvaluacionDTO : DetallesEvaluacionesDTO) {
                DetalleEvaluacion detalleEvaluacion = new DetalleEvaluacion();
                detalleEvaluacion.setId(new DetalleEvaluacionPK(detalleEvaluacionDTO.getIdArea(), detalleEvaluacionDTO.getIdPregunta(), detalleEvaluacionDTO.getIdCalificacion(), evCalidad.getIdEvaluacion()));
                detalleEvaluacion.setObservaciones(detalleEvaluacionDTO.getObservaciones());
                detalleEvaluacionRepository.save(detalleEvaluacion);
            }
            return ResponseEntity.status(HttpStatus.CREATED).body("La evaluacion se ha creado correctamente");
        }catch (HttpMessageNotReadableException e) {
            // excepción al deserializar el JSON
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error al procesar la solicitud: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error guardando el formulario");
        }

    }
}
