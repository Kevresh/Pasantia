package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "puntos")
public class Puntos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_punto")
    private int idPunto;

    @Column(name = "Nombre")
    private String nombre;

    public int getIdPunto() {
        return idPunto;
    }

    public void setIdPunto(int idPunto) {
        this.idPunto = idPunto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Puntos() {
    }

    public Puntos(int idPunto, String nombre) {
        this.idPunto = idPunto;
        this.nombre = nombre;
    }
}
