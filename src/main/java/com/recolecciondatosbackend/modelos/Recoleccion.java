package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "recoleccion")
public class Recoleccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRecoleccion")
    private int idRecoleccion;

    @ManyToOne
    @JoinColumn(name = "idPeriodo", nullable = false)
    private Periodo periodo;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "ResponsableProceso", nullable = false)
    private String responsableProceso;

    @Column(name = "ResponsableCargue", nullable = false)
    private String responsableCargue;

    @Column(name = "NoFacturaVenta", nullable = false)
    private String NoFacturaVenta;

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public String getNoFacturaVenta() {
        return NoFacturaVenta;
    }

    public void setNoFacturaVenta(String noFacturaVenta) {
        NoFacturaVenta = noFacturaVenta;
    }

    public Recoleccion(Periodo periodo, LocalDate fecha, String responsableProceso, String responsableCargue, String noFacturaVenta) {
        this.periodo = periodo;
        this.fecha = fecha;
        this.responsableProceso = responsableProceso;
        this.responsableCargue = responsableCargue;
        NoFacturaVenta = noFacturaVenta;
    }

    public Recoleccion() {
    }
}
