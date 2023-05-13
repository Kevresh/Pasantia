package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Plato;
import com.recolecciondatosbackend.modelos.PlatoCompetencia;
import jakarta.persistence.*;

import java.time.LocalDate;

public class comparacionPlatoDTO {

    private int idPlatoUAO;
    private int idPlatoCompetencia;
    private int idPeriodo;
    private LocalDate fechaComparacion;
    private String responsableProceso;
    private String responsableCargue;

    public int getIdPlatoUAO() {
        return idPlatoUAO;
    }

    public void setIdPlatoUAO(int idPlatoUAO) {
        this.idPlatoUAO = idPlatoUAO;
    }

    public int getIdPlatoCompetencia() {
        return idPlatoCompetencia;
    }

    public void setIdPlatoCompetencia(int idPlatoCompetencia) {
        this.idPlatoCompetencia = idPlatoCompetencia;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
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

    public comparacionPlatoDTO() {
    }

    public comparacionPlatoDTO(int idPlatoUAO, int idPlatoCompetencia, int idPeriodo, LocalDate fechaComparacion, String responsableProceso, String responsableCargue) {
        this.idPlatoUAO = idPlatoUAO;
        this.idPlatoCompetencia = idPlatoCompetencia;
        this.idPeriodo = idPeriodo;
        this.fechaComparacion = fechaComparacion;
        this.responsableProceso = responsableProceso;
        this.responsableCargue = responsableCargue;
    }
}
