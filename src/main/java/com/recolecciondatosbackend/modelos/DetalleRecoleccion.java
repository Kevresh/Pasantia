package com.recolecciondatosbackend.modelos;

import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleRecoleccionPK;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "detalleRecoleccion")
public class DetalleRecoleccion {

    @EmbeddedId
    private DetalleRecoleccionPK id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRecoleccion", referencedColumnName = "idRecoleccion", insertable = false, updatable = false)
    private Recoleccion recoleccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idMaterial", referencedColumnName = "idMaterial", insertable = false, updatable = false)
    private Material material;

    @Column(name = "cantidad", nullable = false)
    private double cantidad;

    @Column(name = "valorUnidad", nullable = false)
    private double valorUnidad;

    @Column(name = "fechaRegistro", nullable = false)
    private LocalDate fechaRegistro;

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public DetalleRecoleccionPK getId() {
        return id;
    }

    public void setId(DetalleRecoleccionPK id) {
        this.id = id;
    }

    public Recoleccion getRecoleccion() {
        return recoleccion;
    }

    public void setRecoleccion(Recoleccion recoleccion) {
        this.recoleccion = recoleccion;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
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

    public DetalleRecoleccion(DetalleRecoleccionPK id, Recoleccion recoleccion, Material material, double cantidad, double valorUnidad, LocalDate fechaRegistro) {
        this.id = id;
        this.recoleccion = recoleccion;
        this.material = material;
        this.cantidad = cantidad;
        this.valorUnidad = valorUnidad;
        this.fechaRegistro = fechaRegistro;
    }

    public DetalleRecoleccion() {
    }
}
