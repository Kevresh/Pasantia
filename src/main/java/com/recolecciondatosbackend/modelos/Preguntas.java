package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private int idPunto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area")
    private Areas area;

    @Column(name = "Nombre")
    private String nombre;

    public int getIdPunto() {
        return idPunto;
    }

    public void setIdPunto(int idPunto) {
        this.idPunto = idPunto;
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

    public Preguntas(int idPunto, Areas area, String nombre) {
        this.idPunto = idPunto;
        this.area = area;
        this.nombre = nombre;
    }
}
