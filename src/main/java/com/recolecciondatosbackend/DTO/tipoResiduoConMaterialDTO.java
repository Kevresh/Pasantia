package com.recolecciondatosbackend.DTO;

import java.util.List;

public class tipoResiduoConMaterialDTO {
    private int idTipoResiduo;
    private String nombre;
    private List<materialDTO> material;

    public int getIdTipoResiduo() {
        return idTipoResiduo;
    }

    public void setIdTipoResiduo(int idTipoResiduo) {
        this.idTipoResiduo = idTipoResiduo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<materialDTO> getMaterial() {
        return material;
    }

    public void setMaterial(List<materialDTO> material) {
        this.material = material;
    }

    public tipoResiduoConMaterialDTO(int idTipoResiduo, String nombre, List<materialDTO> material) {
        this.idTipoResiduo = idTipoResiduo;
        this.nombre = nombre;
        this.material = material;
    }

    public tipoResiduoConMaterialDTO() {
    }
}
