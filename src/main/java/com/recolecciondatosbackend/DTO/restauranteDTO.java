package com.recolecciondatosbackend.DTO;

import java.io.Serializable;
import java.util.List;

public class restauranteDTO implements Serializable {
    private int idRestaurante;
    private String nombre;
    private List<platoDTO> platos;

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<platoDTO> getPlatos() {
        return platos;
    }

    public void setPlatos(List<platoDTO> platos) {
        this.platos = platos;
    }

    public restauranteDTO() {
    }

    public restauranteDTO(int idRestaurante, String nombre, List<platoDTO> platos) {
        this.idRestaurante = idRestaurante;
        this.nombre = nombre;
        this.platos = platos;
    }

}
