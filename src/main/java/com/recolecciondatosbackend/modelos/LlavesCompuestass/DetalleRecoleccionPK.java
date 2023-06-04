package com.recolecciondatosbackend.modelos.LlavesCompuestass;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DetalleRecoleccionPK implements Serializable{
    @Column(name = "idRecoleccion")
    private int idRecoleccion;

    @Column(name = "idMaterial")
    private int idMaterial;

    public DetalleRecoleccionPK() {
    }

    public DetalleRecoleccionPK(int idRecoleccion, int idMaterial) {
        this.idRecoleccion = idRecoleccion;
        this.idMaterial = idMaterial;
    }
}
