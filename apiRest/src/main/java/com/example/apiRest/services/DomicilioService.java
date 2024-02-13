package com.example.apiRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRest.models.DomicilioModel;
import com.example.apiRest.repositories.IDomicilioRepository;


@Service
public class DomicilioService {
    

    @Autowired//para inyeccion de dependencias
    IDomicilioRepository domicilioRepository;

    public ArrayList<DomicilioModel> getDomicilios(){
        return (ArrayList<DomicilioModel>) domicilioRepository.findAll();
    }
    
    public List<DomicilioModel> getDomiciliosOrdenadosPorFecha() {
        return domicilioRepository.findAllByOrderByFechaOperacionDesc();
    }

    public List<Object[]> getDomiciliosAndActividadesAndCaracteres() {
        return domicilioRepository.findDomiciliosAndActividadesAndCaracteres();
    }
}
