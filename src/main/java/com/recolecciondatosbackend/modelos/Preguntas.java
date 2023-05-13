package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private int idPregunta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area", nullable = false)
    private Areas area;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPunto) {
        this.idPregunta = idPunto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Areas getIdArea() {
        return area;
    }

    public void setIdArea(Areas idArea) {
        this.area = idArea;
    }

    public Preguntas() {
    }

    public Preguntas(int idPregunta, Areas area, String nombre) {
        this.idPregunta = idPregunta;
        this.area = area;
        this.nombre = nombre;
    }
}
