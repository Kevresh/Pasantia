package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "puntos")
public class Puntos {
    @Id
    @Column(name = "idPunto")
    private int idPunto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idArea")
    private Areas area;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Calificacion")
    private int calificacion;

    @Column(name = "Observaciones")
    private String observaciones;

    public int getIdPunto() {
        return idPunto;
    }

    public void setIdPunto(int idPunto) {
        this.idPunto = idPunto;
    }

    public Areas getArea() {
        return area;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Puntos() {
    }

    public Puntos(int idPunto, Areas area, String nombre, int calificacion, String observaciones) {
        this.idPunto = idPunto;
        this.area = area;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.observaciones = observaciones;
    }
}
