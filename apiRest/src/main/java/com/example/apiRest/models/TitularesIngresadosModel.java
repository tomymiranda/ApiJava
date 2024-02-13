package com.example.apiRest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Titulares_Ingresados")
public class TitularesIngresadosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    @Column
    private Integer operacion_id;

    public Integer getOperacion_id() {
        return operacion_id;
    }

    public void setOperacion_id(Integer operacion_id) {
        this.operacion_id = operacion_id;
    }

    @Column
    private Integer caracter_id;

    public Integer getCaracter_id() {
        return caracter_id;
    }

    public void setCaracter_id(Integer caracter_id) {
        this.caracter_id = caracter_id;
    }
    

    @Column
    private Long cuit_titular;

    public Long getCuit() {
        return cuit_titular;
    }
    
    public void setCuit(Long cuit) {
        this.cuit_titular = cuit;
    }

    @Column
    private String razon_social;

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social= razon_social;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "operacion_id", insertable = false, updatable = false)
    private DomicilioModel domicilioAsociado;

    public DomicilioModel getDomicilioAsociado() {
        return domicilioAsociado;
    }

    public void setDomicilioAsociado(DomicilioModel domicilioAsociado) {
        this.domicilioAsociado = domicilioAsociado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="caracter_id", insertable = false, updatable = false)
    private TipoCaracteresModel caracterAsociado;

    public TipoCaracteresModel getCaracterAsociado() {
        return caracterAsociado;
    }

    public void setCaracterAsociado(TipoCaracteresModel caracterAsociado) {
        this.caracterAsociado = caracterAsociado;
    }
}
