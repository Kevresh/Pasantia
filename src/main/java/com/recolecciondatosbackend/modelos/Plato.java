package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "plato")
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlato")
    private int idPlato;

    @ManyToOne
    @JoinColumn(name = "idRestaurante", nullable = false)
    private Restaurante restaurante;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Precio", nullable = false)
    private int precio;

    @Column(name = "fechaCreacion", nullable = false)
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

    public Plato() {
    }

    public Plato(Restaurante restaurante, String nombre, int precio, LocalDate fechaCreacion) {
        this.restaurante = restaurante;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
    }
}