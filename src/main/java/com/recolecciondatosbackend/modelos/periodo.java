package com.recolecciondatosbackend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "periodo")
public class periodo {
    @Id
    @Column(name = "idPeriodo")
    private String idPeriodo;

    @Column(name = "fechaInicio")
    private LocalDate fechaInicio;

    @Column(name = "fechaFin")
    private LocalDate fechaFin;

    public String getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public periodo() {
    }

    public periodo(String idPeriodo, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idPeriodo = idPeriodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
