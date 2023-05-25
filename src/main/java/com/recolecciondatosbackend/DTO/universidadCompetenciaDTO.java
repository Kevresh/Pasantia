package com.recolecciondatosbackend.DTO;

import java.io.Serializable;
import java.util.List;

public class universidadCompetenciaDTO implements Serializable {
    private int idUniversidad;
    private String nombre;
    private List<restauranteCompetenciaDTO> restaurantes;

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<restauranteCompetenciaDTO> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<restauranteCompetenciaDTO> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public universidadCompetenciaDTO(int idUniversidad, String nombre, List<restauranteCompetenciaDTO> restaurantes) {
        this.idUniversidad = idUniversidad;
        this.nombre = nombre;
        this.restaurantes = restaurantes;
    }

    public universidadCompetenciaDTO() {
    }
}
