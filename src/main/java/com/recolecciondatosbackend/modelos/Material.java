package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMaterial")
    private int idMaterial;

    @ManyToOne
    @JoinColumn(name = "idTipoResiduo", nullable = false)
    private TipoResiduo tipoResiduo;

    @Column(name="nombre", nullable = false)
    private String nombre;

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public TipoResiduo getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(TipoResiduo tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Material(int idMaterial, TipoResiduo tipoResiduo, String nombre) {
        this.idMaterial = idMaterial;
        this.tipoResiduo = tipoResiduo;
        this.nombre = nombre;
    }

    public Material() {
    }
}
