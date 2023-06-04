package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tiporesiduo")
public class TipoResiduo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoResiduo")
    private int idTipoResiduo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    public int getIdTipoResiduo() {
        return idTipoResiduo;
    }

    public void setIdTipoResiduo(int idTipoResiduo) {
        this.idTipoResiduo = idTipoResiduo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoResiduo(int idTipoResiduo, String nombre) {
        this.idTipoResiduo = idTipoResiduo;
        this.nombre = nombre;
    }

    public TipoResiduo() {
    }
}
