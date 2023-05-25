package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "platoCompetencia")
public class PlatoCompetencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlato;

    @ManyToOne
    @JoinColumn(name = "idRestauranteCompetencia", nullable = false)
    private RestauranteCompetencia restauranteCompetencia;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "fechaCreacion", nullable = false)
    private LocalDate fechaCreacion;

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
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

    public PlatoCompetencia(int idPlato, RestauranteCompetencia restauranteCompetencia, String nombre, LocalDate fechaCreacion) {
        this.idPlato = idPlato;
        this.restauranteCompetencia = restauranteCompetencia;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public PlatoCompetencia() {
    }
}
