package com.example.apiRest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.apiRest.models.TitularesIngresadosModel;
import com.example.apiRest.repositories.ITitularesIngresadosRepository;

@Service
public class TitularesIngresadosService {
    
    @Autowired
    private ITitularesIngresadosRepository titularesIngresadosRepository;

    public List<TitularesIngresadosModel> getTitularesIngresadosWithDomicilios() {
        return titularesIngresadosRepository.findTitularesIngresadosWithDomicilios();
    }

}
