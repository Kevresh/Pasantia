package com.recolecciondatosbackend.modelos.LlavesCompuestass;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AreasPuntosPK implements Serializable {

    @Column(name = "id_area")
    private int idArea;

    @Column(name = "id_punto")
    private int idPunto;

    public AreasPuntosPK() {
    }
}
