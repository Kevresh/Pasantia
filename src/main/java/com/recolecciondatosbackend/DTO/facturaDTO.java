package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.Periodo;
import com.recolecciondatosbackend.modelos.Proveedor;
import com.recolecciondatosbackend.modelos.Servicio;
import jakarta.persistence.*;

import java.time.LocalDate;

public class facturaDTO {

    private int idFactura;

    private int idProveedor;

    private int idPeriodo;

    private int idServicio;

    private LocalDate fechaFacturacion;

    private int ordenServicio;

    private LocalDate fechaCargue;

    private int cobro;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public int getOrdenServicio() {
        return ordenServicio;
    }

    public void setOrdenServicio(int ordenServicio) {
        this.ordenServicio = ordenServicio;
    }

    public LocalDate getFechaCargue() {
        return fechaCargue;
    }

    public void setFechaCargue(LocalDate fechaCargue) {
        this.fechaCargue = fechaCargue;
    }

    public int getCobro() {
        return cobro;
    }

    public void setCobro(int cobro) {
        this.cobro = cobro;
    }

    public facturaDTO(int idFactura, int idProveedor, int idPeriodo, int idServicio, LocalDate fechaFacturacion, int ordenServicio, LocalDate fechaCargue, int cobro) {
        this.idFactura = idFactura;
        this.idProveedor = idProveedor;
        this.idPeriodo = idPeriodo;
        this.idServicio = idServicio;
        this.fechaFacturacion = fechaFacturacion;
        this.ordenServicio = ordenServicio;
        this.fechaCargue = fechaCargue;
        this.cobro = cobro;
    }

    public facturaDTO() {
    }
}
