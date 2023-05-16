package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @Column(name = "idFactura", nullable = false)
    private int idFactura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idContrato", nullable = false)
    private Contrato contrato;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPeriodo", nullable = false)
    private Periodo periodo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idServicio", nullable = false)
    private Servicio servicio;

    @Column(name="fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "ordenServicio", nullable = false)
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

    public Factura(int idFactura, Contrato contrato, Periodo periodo, Servicio servicio, LocalDate fecha, int ordenServicio) {
        this.idFactura = idFactura;
        this.contrato = contrato;
        this.periodo = periodo;
        this.servicio = servicio;
        this.fecha = fecha;
        this.ordenServicio = ordenServicio;
    }

    public Factura() {
    }
}
