package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "platoCompetencia")
public class PlatoCompetencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlatoCompetencia")
    private int idPlatoCompetencia;

    @ManyToOne
    @JoinColumn(name = "idRestauranteCompetencia", nullable = false)
    private RestauranteCompetencia restauranteCompetencia;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "fechaCreacion", nullable = false)
    private LocalDate fechaCreacion;

    public int getIdPlatoCompetencia() {
        return idPlatoCompetencia;
    }

    public void setIdPlatoCompetencia(int idPlato) {
        this.idPlatoCompetencia = idPlato;
    }

    public RestauranteCompetencia getRestauranteCompetencia() {
        return restauranteCompetencia;
    }

    public void setRestauranteCompetencia(RestauranteCompetencia restauranteCompetencia) {
        this.restauranteCompetencia = restauranteCompetencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public PlatoCompetencia(RestauranteCompetencia restauranteCompetencia, String nombre, LocalDate fechaCreacion) {
        this.restauranteCompetencia = restauranteCompetencia;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public PlatoCompetencia() {
    }
}
