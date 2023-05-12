package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "areas")
public class Areas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area", nullable = false)
    private int idArea;


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

    public Areas(int idArea, LocalDate fecha, String nombre) {
        this.idArea = idArea;
        this.fecha = fecha;
        this.nombre = nombre;
    }
}
