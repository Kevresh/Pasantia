package com.recolecciondatosbackend.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.recolecciondatosbackend.modelos.Precio;
import com.recolecciondatosbackend.modelos.Restaurante;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

public class platoDTO implements Serializable {


    private int idRestaurante;


    private String nombre;

    private LocalDate fechaCreacion;

    private int precio;

    private int idPeriodo;

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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public platoDTO(int idRestaurante, String nombre, LocalDate fechaCreacion, int precio, int idPeriodo) {
        this.idRestaurante = idRestaurante;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.precio = precio;
        this.idPeriodo = idPeriodo;
    }

    public platoDTO() {
    }
}
