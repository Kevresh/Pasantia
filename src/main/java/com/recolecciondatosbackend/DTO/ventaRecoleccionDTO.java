package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.Residuo;
import jakarta.persistence.*;

import java.time.LocalDate;

public class ventaRecoleccionDTO {

    private int idVentaRecoleccion;

    private int idResiduo;

    private LocalDate fechaFactura;

    private double totalKg;

    private double valorUnitario;

    private String responsableCarga;

    private String responsableProceso;

    public int getIdVentaRecoleccion() {
        return idVentaRecoleccion;
    }

    public void setIdVentaRecoleccion(int idVentaRecoleccion) {
        this.idVentaRecoleccion = idVentaRecoleccion;
    }

    public int getIdResiduo() {
        return idResiduo;
    }

    public void setIdResiduo(int idResiduo) {
        this.idResiduo = idResiduo;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getTotalKg() {
        return totalKg;
    }

    public void setTotalKg(double totalKg) {
        this.totalKg = totalKg;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getResponsableCarga() {
        return responsableCarga;
    }

    public void setResponsableCarga(String responsableCarga) {
        this.responsableCarga = responsableCarga;
    }

    public String getResponsableProceso() {
        return responsableProceso;
    }

    public void setResponsableProceso(String responsableProceso) {
        this.responsableProceso = responsableProceso;
    }

    public ventaRecoleccionDTO(int idVentaRecoleccion, int idResiduo, LocalDate fechaFactura, double totalKg, double valorUnitario, String responsableCarga, String responsableProceso) {
        this.idVentaRecoleccion = idVentaRecoleccion;
        this.idResiduo = idResiduo;
        this.fechaFactura = fechaFactura;
        this.totalKg = totalKg;
        this.valorUnitario = valorUnitario;
        this.responsableCarga = responsableCarga;
        this.responsableProceso = responsableProceso;
    }

    public ventaRecoleccionDTO() {
    }
}
