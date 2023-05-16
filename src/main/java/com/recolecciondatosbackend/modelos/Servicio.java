package com.recolecciondatosbackend.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idServicio")
    private int idServicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProveedor", nullable = false)
    private Proveedor proveedor;

     @Column(name = "tipoServicio", nullable = false)
    private String tipoServicio;

     @Column(name = "cobro", nullable = false)
    private Integer cobro;

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Integer getCobro() {
        return cobro;
    }

    public void setCobro(Integer cobro) {
        this.cobro = cobro;
    }

    public Servicio(int idServicio, Proveedor proveedor, String tipoServicio, Integer cobro) {
        this.idServicio = idServicio;
        this.proveedor = proveedor;
        this.tipoServicio = tipoServicio;
        this.cobro = cobro;
    }

    public Servicio() {
    }
}
