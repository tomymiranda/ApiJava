package com.example.apiRest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tipos_de_caracteres")// nombre de la tabla de la bdd
public class TipoCaracteresModel {
    
    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    @Column
    private String caracter;

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
}
