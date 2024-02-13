package com.example.apiRest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Observaciones")
public class ObservacionesModel {
    
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    @Column
    private Integer operacionId;

    public Integer getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(Integer operacionId) {
        this.operacionId = operacionId;
    }

    @Column
    private String observacion;

    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
