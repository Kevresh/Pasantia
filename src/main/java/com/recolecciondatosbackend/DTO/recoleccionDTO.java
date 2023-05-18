package com.recolecciondatosbackend.DTO;


import java.time.LocalDate;

public class recoleccionDTO {

    private int idRecoleccion;

    private int idPeriodo;

    private LocalDate fecha;

    private String responsableProceso;

    private String responsableCargue;

    private String NoFacturaVenta;

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

    public String getNoFacturaVenta() {
        return NoFacturaVenta;
    }

    public void setNoFacturaVenta(String noFacturaVenta) {
        NoFacturaVenta = noFacturaVenta;
    }

    public recoleccionDTO(int idRecoleccion, int idPeriodo, LocalDate fecha, String responsableProceso, String responsableCargue, String noFacturaVenta) {
        this.idRecoleccion = idRecoleccion;
        this.idPeriodo = idPeriodo;
        this.fecha = fecha;
        this.responsableProceso = responsableProceso;
        this.responsableCargue = responsableCargue;
        NoFacturaVenta = noFacturaVenta;
    }

    public recoleccionDTO() {
    }
}
