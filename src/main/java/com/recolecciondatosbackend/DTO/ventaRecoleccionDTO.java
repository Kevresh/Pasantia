package com.recolecciondatosbackend.DTO;

import com.recolecciondatosbackend.modelos.Residuo;
import jakarta.persistence.*;

import java.time.LocalDate;

public class ventaRecoleccionDTO {

    private int idVentaRecoleccion;

    private int idResiduo;

    private LocalDate fechaFactura;

    private double totalKg;

    private double valorUnitario;

    private String responsableCarga;

    private String responsableProceso;

}
