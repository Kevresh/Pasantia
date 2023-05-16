package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.Contrato;
import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Servicio;
import jakarta.persistence.*;

import java.time.LocalDate;

public class facturaDTO {

    private int idFactura;

    private Contrato contrato;

    private Periodo periodo;

    private Servicio servicio;

    private LocalDate fecha;

    private int ordenServicio;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getOrdenServicio() {
        return ordenServicio;
    }

    public void setOrdenServicio(int ordenServicio) {
        this.ordenServicio = ordenServicio;
    }

    public facturaDTO(int idFactura, Contrato contrato, Periodo periodo, Servicio servicio, LocalDate fecha, int ordenServicio) {
        this.idFactura = idFactura;
        this.contrato = contrato;
        this.periodo = periodo;
        this.servicio = servicio;
        this.fecha = fecha;
        this.ordenServicio = ordenServicio;
    }

    public facturaDTO() {
    }
}
