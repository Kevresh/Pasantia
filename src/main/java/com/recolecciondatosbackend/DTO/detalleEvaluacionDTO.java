package com.recolecciondatosbackend.DTO;

import java.io.Serializable;

public class detalleEvaluacionDTO implements Serializable {

    private int idArea;

    private int idCalificacion;

    private int idPregunta;

    private int idEvCalidad;

    private String observaciones;

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdEvCalidad() {
        return idEvCalidad;
    }

    public void setIdEvCalidad(int idEvCalidad) {
        this.idEvCalidad = idEvCalidad;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public detalleEvaluacionDTO() {
    }

    public detalleEvaluacionDTO(int idArea, int idCalificacion, int idPregunta, int idEvCalidad, String observaciones) {
        this.idArea = idArea;
        this.idCalificacion = idCalificacion;
        this.idPregunta = idPregunta;
        this.idEvCalidad = idEvCalidad;
        this.observaciones = observaciones;
    }
}