package com.example.apiRest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRest.models.ObservacionesModel;
import com.example.apiRest.repositories.IObservacionesRepository;

@Service
public class ObservacionesService {
    
    @Autowired
    IObservacionesRepository observacionesRepository;

    public ArrayList<ObservacionesModel> getObservaciones(){
        return (ArrayList<ObservacionesModel>) observacionesRepository.findAll();
    }
}
