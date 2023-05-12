package com.recolecciondatosbackend.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.recolecciondatosbackend.modelos.Areas;
import jakarta.persistence.*;

import java.io.Serializable;

public class preguntasDTO implements Serializable {

    private int idPunto;

    @JsonIgnore
    private Areas idArea;

    private String nombre;

    public int getIdPunto() {
        return idPunto;
    }

    public void setIdPunto(int idPunto) {
        this.idPunto = idPunto;
    }

    public Areas getIdArea() {
        return idArea;
    }

    public void setIdArea(Areas idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public preguntasDTO(int idPunto, Areas idArea, String nombre) {
        this.idPunto = idPunto;
        this.idArea = idArea;
        this.nombre = nombre;
    }

    public preguntasDTO() {
    }
}
