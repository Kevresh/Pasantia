package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "comparacion_plato")
public class ComparacionPlato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComparacion")
    private int idComparacion;

    @ManyToOne
    @JoinColumn(name = "codPlatoUAO")
    private Plato platoUAO;

    @ManyToOne
    @JoinColumn(name = "codPlatoCompetencia")
    private PlatoCompetencia platoCompetencia;

    @ManyToOne
    @JoinColumn(name = "idPeriodo")
    private Periodo periodo;

    @Column(name = "FechaComparacion")
    private LocalDate fechaComparacion;

    @Column(name = "ResponsableProceso")
    private String responsableProceso;

    @Column(name = "ResponsableCargue")
    private String responsableCargue;

    public int getIdComparacion() {
        return idComparacion;
    }

    public void setIdComparacion(int idComparacion) {
        this.idComparacion = idComparacion;
    }

    public Plato getPlatoUAO() {
        return platoUAO;
    }

    public void setPlatoUAO(Plato platoUAO) {
        this.platoUAO = platoUAO;
    }

    public PlatoCompetencia getPlatoCompetencia() {
        return platoCompetencia;
    }

    public void setPlatoCompetencia(PlatoCompetencia platoCompetencia) {
        this.platoCompetencia = platoCompetencia;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public LocalDate getFechaComparacion() {
        return fechaComparacion;
    }

    public void setFechaComparacion(LocalDate fechaComparacion) {
        this.fechaComparacion = fechaComparacion;
    }

    public String getResponsableProceso() {
        return responsableProceso;
    }

    public void setResponsableProceso(String responsableProceso) {
        this.responsableProceso = responsableProceso;
    }

    public String getResponsableCargue() {
        return responsableCargue;
    }

    public void setResponsableCargue(String responsableCargue) {
        this.responsableCargue = responsableCargue;
    }

    public ComparacionPlato() {
    }

    public ComparacionPlato(int idComparacion, Plato platoUAO, PlatoCompetencia platoCompetencia, Periodo periodo, LocalDate fechaComparacion, String responsableProceso, String responsableCargue) {
        this.idComparacion = idComparacion;
        this.platoUAO = platoUAO;
        this.platoCompetencia = platoCompetencia;
        this.periodo = periodo;
        this.fechaComparacion = fechaComparacion;
        this.responsableProceso = responsableProceso;
        this.responsableCargue = responsableCargue;
    }
}