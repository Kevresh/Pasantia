package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "calificacion")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion", nullable = false)
    private int idCalificacion;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

}
