package com.recolecciondatosbackend.modelos;

import com.recolecciondatosbackend.modelos.LlavesCompuestass.DetalleRecoleccionPK;
import jakarta.persistence.*;

@Entity
@Table(name = "detalleRecoleccion")
public class DetallerRecoleccion {

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

    public DetallerRecoleccion(DetalleRecoleccionPK id, Recoleccion recoleccion, Material material, double cantidad, double valorUnidad) {
        this.id = id;
        this.recoleccion = recoleccion;
        this.material = material;
        this.cantidad = cantidad;
        this.valorUnidad = valorUnidad;
    }

    public DetallerRecoleccion() {
    }
}
