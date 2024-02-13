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
@Table(name = "Actividades_Ingresadas")// nombre de la tabla de la bdd
public class ActividadesIngresadasModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private int operacion_id;
    
    public int getOperacion_id() {
        return operacion_id;
    }

    public void setOperacion_id(int operacion_id) {
        this.operacion_id = operacion_id;
    }


    @Column
    private int actividad_id;

    public int getActividad_id() {
        return actividad_id;
    }

    public void setActividad_id(int actividad_id) {
        this.actividad_id = actividad_id;
    }

    @Column
    private int principal;

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "operacion_id",insertable = false, updatable = false)
    private DomicilioModel domicilioAsociado;

    public DomicilioModel getDomicilioAsociado() {
        return domicilioAsociado;
    }

    public void setDomicilioAsociado(DomicilioModel domicilioAsociado) {
        this.domicilioAsociado = domicilioAsociado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="actividad_id",insertable = false, updatable = false)
    private TodasLasActividadesModel actividadAsociada;

    public TodasLasActividadesModel getActividadAsociada() {
        return actividadAsociada;
    }

    public void setActividadAsociada(TodasLasActividadesModel actividadAsocidadParam) {
        this.actividadAsociada = actividadAsocidadParam;
    }
}
