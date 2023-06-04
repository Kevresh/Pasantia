package com.recolecciondatosbackend.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;

public class usuarioDTO implements Serializable {

    private String cedula;

    private String usuario;

    private String contrasena;

    private String nombre;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public usuarioDTO() {
    }

    public usuarioDTO(String cedula, String usuario, String contrasena, String nombre) {
        this.cedula = cedula;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
    }
}
