package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "evcalidad")
public class EvCalidad {
    @Id
    @Column(name = "idEvaluacion")
    private Long idEvaluacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPeriodoAcademico")
    private periodo periodoAcademico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Calificacion")
    private calificacion calificacion;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Observacion")
    private String observacion;

    @Column(name = "Fecha")
    private LocalDate fecha;

    public Long getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public periodo getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(periodo periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EvCalidad() {
    }

    public EvCalidad(Long idEvaluacion, periodo periodoAcademico, calificacion calificacion, String tipo, String nombre, String observacion, LocalDate fecha) {
        this.idEvaluacion = idEvaluacion;
        this.periodoAcademico = periodoAcademico;
        this.calificacion = calificacion;
        this.tipo = tipo;
        this.nombre = nombre;
        this.observacion = observacion;
        this.fecha = fecha;
    }
}
