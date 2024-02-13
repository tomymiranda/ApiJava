package com.example.apiRest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRest.models.ActividadesIngresadasModel;
import com.example.apiRest.repositories.IActividadesIngesadasRepository;

@Service
public class ActividadesIngresadasService {
    
    @Autowired
    IActividadesIngesadasRepository ActividadesIngresadasRepository;

    public ArrayList<ActividadesIngresadasModel> getActividadesIngresadas(){
        return (ArrayList<ActividadesIngresadasModel>) ActividadesIngresadasRepository.findAll();
    }

    public ArrayList<ActividadesIngresadasModel> findwithDomiciliosAndTodasLasActividades(){
        return (ArrayList<ActividadesIngresadasModel>) ActividadesIngresadasRepository.findwithDomiciliosAndTodasLasActividades();
    }

}
