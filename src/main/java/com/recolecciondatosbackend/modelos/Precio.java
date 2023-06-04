package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "precio")
public class Precio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrecio")
    private int idPrecio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPeriodo", nullable = false)
    private Periodo periodo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlato", nullable = false)
    private Plato plato;

    @Column(name = "precio", nullable = false)
    private int precio;

    public Plato getIdPlato() {
        return plato;
    }

    public void setIdPlato(Plato idPlato) {
        this.plato = idPlato;
    }

    public int getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(int idPrecio) {
        this.idPrecio = idPrecio;
    }

    public Periodo getIdPeriodo() {
        return periodo;
    }

    public void setIdPeriodo(Periodo idPeriodo) {
        this.periodo = idPeriodo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Precio(Periodo periodo, Plato plato,int precio) {
        this.idPrecio = idPrecio;
        this.periodo = periodo;
        this.plato = plato;
        this.precio = precio;
    }

    public Precio() {
    }
}
