package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFactura", nullable = false)
    private int idFactura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProveedor", nullable = false)
    private Proveedor proveedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPeriodo", nullable = false)
    private Periodo periodo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idServicio", nullable = false)
    private Servicio servicio;

    @Column(name="fechaFacturacion", nullable = false)
    private LocalDate fechaFacturacion;

    @Column(name = "NumeroFactura", nullable = false)
    private String NumeroFactura;

    @Column(name="fechaCargue", nullable = false)
    private LocalDate fechaCargue;

    @Column(name="cobro", nullable = false)
    private int cobro;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
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

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public String getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        NumeroFactura = numeroFactura;
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

    public Factura(Proveedor proveedor, Periodo periodo, Servicio servicio, LocalDate fechaFacturacion, String NumeroFactura, LocalDate fechaCargue, int cobro) {
        this.proveedor = proveedor;
        this.periodo = periodo;
        this.servicio = servicio;
        this.fechaFacturacion = fechaFacturacion;
        this.NumeroFactura = NumeroFactura;
        this.fechaCargue = fechaCargue;
        this.cobro = cobro;
    }

    public Factura() {
    }
}
