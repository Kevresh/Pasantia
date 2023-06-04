package com.recolecciondatosbackend.DTO;

public class servicioDTO {

    private int idServicio;

    private int idProveedor;

    private String tipoServicio;

    private Integer cobro;

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Integer getCobro() {
        return cobro;
    }

    public void setCobro(Integer cobro) {
        this.cobro = cobro;
    }

    public servicioDTO(int idServicio, int idProveedor, String tipoServicio, Integer cobro) {
        this.idServicio = idServicio;
        this.idProveedor = idProveedor;
        this.tipoServicio = tipoServicio;
        this.cobro = cobro;
    }

    public servicioDTO() {
    }
}

