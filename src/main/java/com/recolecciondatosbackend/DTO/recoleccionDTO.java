package com.recolecciondatosbackend.DTO;


import java.time.LocalDate;

public class recoleccionDTO {

    private int idRecoleccion;

    private int idPeriodo;

    private LocalDate fecha;

    private String responsableProceso;

    private String responsableCargue;

    private String numeroFacturaVenta;

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
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

    public String getNumeroFacturaVenta() {
        return numeroFacturaVenta;
    }

    public void setNumeroFacturaVenta(String numeroFacturaVenta) {
        this.numeroFacturaVenta = numeroFacturaVenta;
    }

    public recoleccionDTO(int idRecoleccion, int idPeriodo, LocalDate fecha, String responsableProceso, String responsableCargue, String numeroFacturaVenta) {
        this.idRecoleccion = idRecoleccion;
        this.idPeriodo = idPeriodo;
        this.fecha = fecha;
        this.responsableProceso = responsableProceso;
        this.responsableCargue = responsableCargue;
        this.numeroFacturaVenta = numeroFacturaVenta;
    }

    public recoleccionDTO() {
    }
}
