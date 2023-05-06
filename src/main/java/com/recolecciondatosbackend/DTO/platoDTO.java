package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.Restaurante;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

public class platoDTO implements Serializable {

    private int idPlato;

    private Restaurante restaurante;

    private String nombre;

    private int precio;

    private LocalDate fechaCreacion;

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
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

    public platoDTO(int idPlato, Restaurante restaurante, String nombre, int precio, LocalDate fechaCreacion) {
        this.idPlato = idPlato;
        this.restaurante = restaurante;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }

    public platoDTO() {
    }
}
