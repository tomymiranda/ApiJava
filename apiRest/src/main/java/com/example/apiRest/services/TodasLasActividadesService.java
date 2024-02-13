package com.example.apiRest.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiRest.repositories.ITodasLasActividadesRepository;
import com.example.apiRest.models.TodasLasActividadesModel;
@Service
public class TodasLasActividadesService {
    
    @Autowired
    ITodasLasActividadesRepository todasLasActividadesRepository;

     public ArrayList<TodasLasActividadesModel> getTodasLasActividades(){
         return (ArrayList<TodasLasActividadesModel>) todasLasActividadesRepository.findAll();
     }
}
