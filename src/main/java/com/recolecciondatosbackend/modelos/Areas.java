package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "areas")
public class Areas {
    @Id
    @Column(name = "idArea", nullable = false)
    private int idArea;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEvaluacion", nullable = false)
    private EvCalidad evCalidad;

    @Column(name = "Fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public EvCalidad getEvCalidad() {
        return evCalidad;
    }

    public void setEvCalidad(EvCalidad evCalidad) {
        this.evCalidad = evCalidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Areas() {
    }

    public Areas(int idArea, EvCalidad evCalidad, LocalDate fecha, String nombre) {
        this.idArea = idArea;
        this.evCalidad = evCalidad;
        this.fecha = fecha;
        this.nombre = nombre;
    }
}
