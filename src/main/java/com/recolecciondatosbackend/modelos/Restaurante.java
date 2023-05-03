package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurante")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRestaurante")
    private int idRestaurante;

    @ManyToOne
    @JoinColumn(name = "idEvaluacion")
    private EvCalidad evaluacion;

    @Column(name = "Nombre")
    private String nombre;

    // getters y setters

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public EvCalidad getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(EvCalidad evaluacion) {
        this.evaluacion = evaluacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Restaurante() {
    }

    public Restaurante(int idRestaurante, EvCalidad evaluacion, String nombre) {
        this.idRestaurante = idRestaurante;
        this.evaluacion = evaluacion;
        this.nombre = nombre;
    }
}