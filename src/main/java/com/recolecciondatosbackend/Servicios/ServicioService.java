package com.recolecciondatosbackend.Servicios;

import com.recolecciondatosbackend.modelos.Servicio;

import java.util.List;

public interface ServicioService {

    Servicio crearServicio(Servicio servicio);

    Servicio getServicioById(int id);

    List<Servicio> obtenerServicios();
}
