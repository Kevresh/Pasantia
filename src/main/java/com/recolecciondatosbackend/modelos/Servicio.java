package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idServicio")
    private int idServicio;


     @Column(name = "nombre", nullable = false)
    private String Nombre;


    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Servicio(int idServicio, String nombre) {
        this.idServicio = idServicio;
        Nombre = nombre;
    }

    public Servicio() {
    }
}
