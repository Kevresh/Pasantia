package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.Servicio;

public interface ServicioService {

    Servicio crearServicio(Servicio servicio);

    Servicio getServicioById(int id);

}
