package com.recolecciondatosbackend.modelos.LlavesCompuestass;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DetalleEvaluacionPK implements Serializable {

    @Column(name = "id_area")
    private int idArea;

    @Column(name = "id_pregunta")
    private int idPregunta;

    @Column(name = "id_calificacion")
    private int idCalificacion;

    @Column(name = "idEvaluacion")
    private int idEvaluacion;

    public DetalleEvaluacionPK() {
    }

    public DetalleEvaluacionPK(int idArea, int idPregunta, int idCalificacion, int idEvaluacion) {
        this.idArea = idArea;
        this.idPregunta = idPregunta;
        this.idCalificacion = idCalificacion;
        this.idEvaluacion = idEvaluacion;
    }
}
