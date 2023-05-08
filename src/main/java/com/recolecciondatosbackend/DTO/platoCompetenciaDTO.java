package com.recolecciondatosbackend.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class platoCompetenciaDTO {

    private int idPlato;

    private String nombreUniversidad;

    private String nombreRestaurante;

    private String nombre;

    private int precio;

    private LocalDate fechaCreacion;

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
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

    public platoCompetenciaDTO() {
    }

    public platoCompetenciaDTO(int idPlato, String nombreUniversidad, String nombreRestaurante, String nombre, int precio, LocalDate fechaCreacion) {
        this.idPlato = idPlato;
        this.nombreUniversidad = nombreUniversidad;
        this.nombreRestaurante = nombreRestaurante;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }
}
