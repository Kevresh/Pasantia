package com.recolecciondatosbackend.DTO;

import java.io.Serializable;

public class restauranteCompetenciaDTO implements Serializable {
    private int idRestaurante;

    private String nombreRestaurante;

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public restauranteCompetenciaDTO(int idRestaurante, String nombreRestaurante) {
        this.idRestaurante = idRestaurante;
        this.nombreRestaurante = nombreRestaurante;
    }

    public restauranteCompetenciaDTO() {
    }
}
