package com.recolecciondatosbackend.modelos.LlavesCompuestass;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DetalleEvaluacionPK implements Serializable {

    @Column(name = "id_area")
    private int idArea;

    @Column(name = "id_pregunta")
    private int idPunto;

    @Column(name = "id_calificacion")
    private int idCalificacion;

    public DetalleEvaluacionPK() {
    }

    public DetalleEvaluacionPK(int idArea, int idPunto, int idCalificacion) {
        this.idArea = idArea;
        this.idPunto = idPunto;
        this.idCalificacion = idCalificacion;
    }
}
