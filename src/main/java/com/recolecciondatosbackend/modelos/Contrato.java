package com.recolecciondatosbackend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "contrato")
public class Contrato {

    @Id
    @Column(name = "idContrato", nullable = false)
    private int idContrato;


    @Column(name = "fechaContrato", nullable = false)
    private LocalDate fechaContrato;

    @Column(name = "valor", nullable = false)
    private int valor;

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Contrato(int idContrato, LocalDate fechaContrato, int valor) {
        this.idContrato = idContrato;
        this.fechaContrato = fechaContrato;
        this.valor = valor;
    }

    public Contrato() {
    }
}
