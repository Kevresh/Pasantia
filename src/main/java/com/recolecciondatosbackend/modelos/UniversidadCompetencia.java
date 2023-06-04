package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "universidadCompetencia")
public class UniversidadCompetencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversidadCompetencia")
    private int idUniversidadCompetencia;

    @Column(name="universidad", nullable = false)
    private String universidad;

    public int getIdUniversidadCompetencia() {
        return idUniversidadCompetencia;
    }

    public void setIdUniversidadCompetencia(int idUniversidadCompetencia) {
        this.idUniversidadCompetencia = idUniversidadCompetencia;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public UniversidadCompetencia(String universidad) {
        this.universidad = universidad;
    }

    public UniversidadCompetencia() {
    }
}
