package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "plato_competencia")
public class PlatoCompetencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlato;

    @Column(name = "nombreUniversidad")
    private String nombreUniversidad;

    @Column(name = "nombreRestaurante")
    private String nombreRestaurante;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Precio")
    private int precio;

    @Column(name = "fechaCreacion")
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

    public PlatoCompetencia() {
    }

    public PlatoCompetencia(int idPlato, String nombreUniversidad, String nombreRestaurante, String nombre, int precio, LocalDate fechaCreacion) {
        this.idPlato = idPlato;
        this.nombreUniversidad = nombreUniversidad;
        this.nombreRestaurante = nombreRestaurante;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }
}
