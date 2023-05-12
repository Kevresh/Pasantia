package com.recolecciondatosbackend.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class areasDTO implements Serializable {

    private int idArea;

    private LocalDate fecha;

    private String nombre;

    private List<preguntasDTO> preguntas;

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<preguntasDTO> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<preguntasDTO> preguntas) {
        this.preguntas = preguntas;
    }

    public areasDTO() {
    }

    public areasDTO(int idArea, LocalDate fecha, String nombre, List<preguntasDTO> preguntas) {
        this.idArea = idArea;
        this.fecha = fecha;
        this.nombre = nombre;
        this.preguntas = preguntas;
    }
}
