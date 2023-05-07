package com.recolecciondatosbackend.DTO;

public class restauranteBasicoDTO {
    private int idRestaurante;
    private String nombre;

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

    public restauranteBasicoDTO(int idRestaurante, String nombre) {
        this.idRestaurante = idRestaurante;
        this.nombre = nombre;
    }

    public restauranteBasicoDTO() {
    }
}
