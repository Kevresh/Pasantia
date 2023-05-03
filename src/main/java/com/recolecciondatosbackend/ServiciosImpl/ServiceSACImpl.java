package com.recolecciondatosbackend.ServiciosImpl;

import com.recolecciondatosbackend.DAO.PlatoDao;
import com.recolecciondatosbackend.Servicios.ServiceSAC;
import com.recolecciondatosbackend.modelos.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceSACImpl implements ServiceSAC {
    @Autowired
    private PlatoDao platoDao;

    @Override
    public Plato crearPlato(Plato plato) {
        return platoDao.save(plato);
    }
}
