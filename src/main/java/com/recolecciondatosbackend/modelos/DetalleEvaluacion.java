package com.recolecciondatosbackend.modelos;

import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleEvaluacionPK;
import jakarta.persistence.*;


@Entity
@Table(name = "detalleEvaluacion")
public class DetalleEvaluacion {

    @EmbeddedId
    private DetalleEvaluacionPK id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idArea")
    @JoinColumn(name = "id_area", referencedColumnName = "id_area", insertable = false, updatable = false)
    private Areas area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregunta", referencedColumnName = "id_pregunta", insertable = false, updatable = false)
    private Preguntas preguntas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_calificacion", referencedColumnName = "id_calificacion", insertable = false, updatable = false)
    private Calificacion calificacon;

    @Column(name = "observaciones")
    private String observaciones;

    public DetalleEvaluacionPK getId() {
        return id;
    }

    public void setId(DetalleEvaluacionPK id) {
        this.id = id;
    }

    public Areas getArea() {
        return area;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas preguntas) {
        this.preguntas = preguntas;
    }

    public Calificacion getCalificacon() {
        return calificacon;
    }

    public void setCalificacon(Calificacion calificacon) {
        this.calificacon = calificacon;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public DetalleEvaluacion() {
    }

    public DetalleEvaluacion(DetalleEvaluacionPK id, Areas area, Preguntas preguntas, Calificacion calificacon, String observaciones) {
        this.id = id;
        this.area = area;
        this.preguntas = preguntas;
        this.calificacon = calificacon;
        this.observaciones = observaciones;
    }

}
