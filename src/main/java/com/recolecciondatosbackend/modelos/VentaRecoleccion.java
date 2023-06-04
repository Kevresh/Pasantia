package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ventaRecoleccion")
public class VentaRecoleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVentaRecoleccion")
    private int idVentaRecoleccion;

    @ManyToOne
    @JoinColumn(name = "idResiduo", nullable = false)
    private Material material;

    @Column(name="fechaFactura", nullable = false)
    private LocalDate fechaFactura;

    @Column(name="totalKg", nullable = false)
    private double totalKg;

    @Column(name="valorUnitario", nullable = false)
    private double valorUnitario;

    @Column(name="responsableCarga", nullable = false)
    private String responsableCarga;

    @Column(name="responsableProceso", nullable = false)
    private String responsableProceso;

    public int getIdVentaRecoleccion() {
        return idVentaRecoleccion;
    }

    public void setIdVentaRecoleccion(int idVentaRecoleccion) {
        this.idVentaRecoleccion = idVentaRecoleccion;
    }

    public Material getResiduo() {
        return material;
    }

    public void setResiduo(Material material) {
        this.material = material;
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

    public VentaRecoleccion(Material material, LocalDate fechaFactura, double totalKg, double valorUnitario, String responsableCarga, String responsableProceso) {
        this.material = material;
        this.fechaFactura = fechaFactura;
        this.totalKg = totalKg;
        this.valorUnitario = valorUnitario;
        this.responsableCarga = responsableCarga;
        this.responsableProceso = responsableProceso;
    }

    public VentaRecoleccion() {
    }
}
