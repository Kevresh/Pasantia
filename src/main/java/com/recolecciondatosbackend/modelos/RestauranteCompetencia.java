package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "restauranteCompetencia")
public class RestauranteCompetencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRestauranteCompetencia")
    private int idRestauranteCompetencia;

    @ManyToOne
    @JoinColumn(name = "idUniversidadCompetencia", nullable = false)
    private UniversidadCompetencia universidadCompetencia;

    @Column(name="nombreRestaurante", nullable = false)
    private String nombreRestaurante;

    public int getIdRestauranteCompetencia() {
        return idRestauranteCompetencia;
    }

    public void setIdRestauranteCompetencia(int idRestauranteCompetencia) {
        this.idRestauranteCompetencia = idRestauranteCompetencia;
    }

    public UniversidadCompetencia getUniversidadCompetencia() {
        return universidadCompetencia;
    }

    public void setUniversidadCompetencia(UniversidadCompetencia universidadCompetencia) {
        this.universidadCompetencia = universidadCompetencia;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public RestauranteCompetencia(int idRestauranteCompetencia, UniversidadCompetencia universidadCompetencia, String nombreRestaurante) {
        this.idRestauranteCompetencia = idRestauranteCompetencia;
        this.universidadCompetencia = universidadCompetencia;
        this.nombreRestaurante = nombreRestaurante;
    }

    public RestauranteCompetencia() {
    }
}
