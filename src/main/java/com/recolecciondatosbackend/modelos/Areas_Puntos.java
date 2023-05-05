package com.recolecciondatosbackend.modelos;

import com.recolecciondatosbackend.modelos.LlavesCompuestass.AreasPuntosPK;
import jakarta.persistence.*;


@Entity
@Table(name = "areas_puntos")
public class Areas_Puntos {

    @EmbeddedId
    private AreasPuntosPK id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_area", referencedColumnName = "id_area", insertable = false, updatable = false)
    private Areas area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_punto", referencedColumnName = "id_punto", insertable = false, updatable = false)
    private Puntos punto;

    @Column(name = "calificacion")
    private Integer calificacion;

    @Column(name = "observaciones")
    private String observaciones;

    public Areas_Puntos() {
    }

    public Areas_Puntos(AreasPuntosPK id, Areas area, Puntos punto, Integer calificacion, String observaciones) {
        this.id = id;
        this.area = area;
        this.punto = punto;
        this.calificacion = calificacion;
        this.observaciones = observaciones;
    }

    //getters y setters
}
