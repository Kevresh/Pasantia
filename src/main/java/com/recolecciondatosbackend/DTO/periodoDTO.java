package com.recolecciondatosbackend.DTO;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class periodoDTO {

    private String idPeriodo;

    private LocalDate fechaInicio;

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

    public periodoDTO() {
    }

    public periodoDTO(String idPeriodo, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idPeriodo = idPeriodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
