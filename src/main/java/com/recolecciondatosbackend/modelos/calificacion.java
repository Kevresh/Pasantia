package com.recolecciondatosbackend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calificacion")
public class calificacion {
    @Id
    @Column(name = "idCalificacion")
    private String idCalificacion;

    @Column(name = "numero")
    private String numero;

    @Column(name = "nombreCalif")
    private String nombreCalif;

    public String getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(String idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombreCalif() {
        return nombreCalif;
    }

    public void setNombreCalif(String nombreCalif) {
        this.nombreCalif = nombreCalif;
    }

    public calificacion() {
    }

    public calificacion(String idCalificacion, String numero, String nombreCalif) {
        this.idCalificacion = idCalificacion;
        this.numero = numero;
        this.nombreCalif = nombreCalif;
    }
}
