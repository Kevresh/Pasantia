package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleRecoleccionPK;
import com.recolecciondatosbackend.modelos.Material;
import com.recolecciondatosbackend.modelos.Recoleccion;
import jakarta.persistence.*;

public class detalleRecoleccionDTO {

    private recoleccionDTO recoleccion;

    private int idMaterial;

    private double cantidad;

    private double valorUnidad;

    public recoleccionDTO getRecoleccion() {
        return recoleccion;
    }

    public void setRecoleccion(recoleccionDTO recoleccion) {
        this.recoleccion = recoleccion;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(double valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public detalleRecoleccionDTO(recoleccionDTO recoleccion, int idMaterial, double cantidad, double valorUnidad) {
        this.recoleccion = recoleccion;
        this.idMaterial = idMaterial;
        this.cantidad = cantidad;
        this.valorUnidad = valorUnidad;
    }

    public detalleRecoleccionDTO() {
    }
}
