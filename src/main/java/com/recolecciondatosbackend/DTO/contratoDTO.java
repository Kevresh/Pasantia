package com.recolecciondatosbackend.DTO;

import java.time.LocalDate;

public class contratoDTO {
    private int idContrato;
    private LocalDate fechaContrato;
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

    public contratoDTO(int idContrato, LocalDate fechaContrato, int valor) {
        this.idContrato = idContrato;
        this.fechaContrato = fechaContrato;
        this.valor = valor;
    }

    public contratoDTO() {
    }
}
