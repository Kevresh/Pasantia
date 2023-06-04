package com.recolecciondatosbackend.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class calificacionDTO {


    private int idCalificacion;

    private String nombre;

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public calificacionDTO(int idCalificacion, String nombre) {
        this.idCalificacion = idCalificacion;
        this.nombre = nombre;
    }

    public calificacionDTO() {
    }
}
