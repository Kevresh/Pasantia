package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.ServiciosImpl.ServiceSACImpl;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import com.recolecciondatosbackend.repositorios.RepositorioSac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ServiceSAC {
    Plato crearPlato(Plato plato);


}
