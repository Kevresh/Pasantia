package com.recolecciondatosbackend.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class platoCompetenciaDTO {

    private int idRestauranteCompetencia;
    private String nombre;

    private LocalDate fechaCreacion;

    private int precio;

    private int idPeriodo;

    public int getIdRestauranteCompetencia() {
        return idRestauranteCompetencia;
    }

    public void setIdRestauranteCompetencia(int idRestauranteCompetencia) {
        this.idRestauranteCompetencia = idRestauranteCompetencia;
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

    public platoCompetenciaDTO(int idRestauranteCompetencia, String nombre, LocalDate fechaCreacion, int precio, int idPeriodo) {
        this.idRestauranteCompetencia = idRestauranteCompetencia;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.precio = precio;
        this.idPeriodo = idPeriodo;
    }

    public platoCompetenciaDTO() {
    }
}
