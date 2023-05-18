package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.TipoResiduo;
import jakarta.persistence.*;

public class materialDTO {

    private int idMaterial;

    private String nombre;

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public materialDTO(int idMaterial, String nombre) {
        this.idMaterial = idMaterial;
        this.nombre = nombre;
    }

    public materialDTO() {
    }
}
