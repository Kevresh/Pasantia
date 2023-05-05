package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "evcalidad")
public class EvCalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEvaluacion")
    private int idEvaluacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPeriodo")
    private Periodo periodoAcademico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRestaurante")
    private Restaurante restaurante;

    @Column(name = "Fecha")
    private LocalDate fecha;

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public Periodo getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(Periodo periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EvCalidad() {
    }

    public EvCalidad(int idEvaluacion, Periodo periodoAcademico, Restaurante restaurante, LocalDate fecha) {
        this.idEvaluacion = idEvaluacion;
        this.periodoAcademico = periodoAcademico;
        this.restaurante = restaurante;
        this.fecha = fecha;
    }
}
