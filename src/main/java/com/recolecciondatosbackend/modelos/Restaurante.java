package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurante")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRestaurante")
    private int idRestaurante;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    // getters y setters

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

    public Restaurante() {
    }

    public Restaurante(int idRestaurante, String nombre) {
        this.nombre = nombre;
    }
}