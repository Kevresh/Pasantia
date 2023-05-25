package com.recolecciondatosbackend.DTO;

import java.io.Serializable;
import java.time.LocalDate;

public class platoBasicoDTO implements Serializable {

    private int idPlato;
    private String nombre;

    private LocalDate fechaCreacion;

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
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

    public platoBasicoDTO(int idPlato,String nombre, LocalDate fechaCreacion) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public platoBasicoDTO() {
    }
}
