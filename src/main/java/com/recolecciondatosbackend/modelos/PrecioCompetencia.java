package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "precioCompetencia")
public class PrecioCompetencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrecioCompetencia")
    private int idPrecioCompetencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPeriodo", nullable = false)
    private Periodo periodo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlatoCompetencia", nullable = false)
    private PlatoCompetencia platoCompetencia;

    @Column(name = "precio", nullable = false)
    private int precio;

    public int getIdPrecioCompetencia() {
        return idPrecioCompetencia;
    }

    public void setIdPrecioCompetencia(int idPrecioCompetencia) {
        this.idPrecioCompetencia = idPrecioCompetencia;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public PlatoCompetencia getPlatoCompetencia() {
        return platoCompetencia;
    }

    public void setPlatoCompetencia(PlatoCompetencia platoCompetencia) {
        this.platoCompetencia = platoCompetencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public PrecioCompetencia(int idPrecioCompetencia, Periodo periodo, PlatoCompetencia platoCompetencia, int precio) {
        this.idPrecioCompetencia = idPrecioCompetencia;
        this.periodo = periodo;
        this.platoCompetencia = platoCompetencia;
        this.precio = precio;
    }

    public PrecioCompetencia() {
    }
}
