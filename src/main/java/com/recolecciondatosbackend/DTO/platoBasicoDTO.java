package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.Restaurante;
import jakarta.persistence.*;

import java.time.LocalDate;

public class platoBasicoDTO {

    private int idRestaurante;

    private String nombre;

    private int precio;

    private LocalDate fechaCreacion;

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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public platoBasicoDTO() {
    }

    public platoBasicoDTO(int idRestaurante, String nombre, int precio, LocalDate fechaCreacion) {
        this.idRestaurante = idRestaurante;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }
}
