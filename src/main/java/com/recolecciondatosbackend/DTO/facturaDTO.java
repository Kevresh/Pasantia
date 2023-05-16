package com.recolecciondatosbackend.DTO;

import java.time.LocalDate;

public class facturaDTO {

    private int idFactura;
    private contratoDTO contrato;
    private int idPeriodo;
    private servicioDTO servicio;
    private LocalDate fecha;
    private int ordenServicio;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public contratoDTO getContrato() {
        return contrato;
    }

    public void setContrato(contratoDTO contrato) {
        this.contrato = contrato;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public servicioDTO getServicio() {
        return servicio;
    }

    public void setServicio(servicioDTO servicio) {
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

    public facturaDTO(int idFactura, contratoDTO contrato, int idPeriodo, servicioDTO servicio, LocalDate fecha, int ordenServicio) {
        this.idFactura = idFactura;
        this.contrato = contrato;
        this.idPeriodo = idPeriodo;
        this.servicio = servicio;
        this.fecha = fecha;
        this.ordenServicio = ordenServicio;
    }

    public facturaDTO() {
    }
}
