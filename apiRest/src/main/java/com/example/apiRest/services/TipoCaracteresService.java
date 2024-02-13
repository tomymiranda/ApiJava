package com.example.apiRest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRest.models.TipoCaracteresModel;
import com.example.apiRest.repositories.ITipoCaracteresRepository;

@Service
public class TipoCaracteresService {
    
    @Autowired
    ITipoCaracteresRepository tipoCaracteresRepository;

    public ArrayList<TipoCaracteresModel> getTipoCaracteres(){
        return (ArrayList<TipoCaracteresModel>)tipoCaracteresRepository.findAll();
    }
}
