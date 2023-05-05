package com.recolecciondatosbackend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "Cedula")
    private String cedula;

    @Column(name = "Usuario")
    private String usuario;

    @Column(name = "Contrasena")
    private String contrasena;

    @Column(name = "Nombre")
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

    public User() {
    }

    public User(String cedula, String usuario, String contrasena, String nombre) {
        this.cedula = cedula;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
    }
}
