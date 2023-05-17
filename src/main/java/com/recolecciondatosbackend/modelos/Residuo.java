package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "residuo")
public class Residuo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idResiduo")
    private int idResiduo;

    @Column(name="tipo", nullable = false)
    private String tipo;

    @Column(name="nombre", nullable = false)
    private String nombre;

    public int getIdResiduo() {
        return idResiduo;
    }

    public void setIdResiduo(int idResiduo) {
        this.idResiduo = idResiduo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Residuo(int idResiduo, String tipo, String nombre) {
        this.idResiduo = idResiduo;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Residuo() {
    }
}
