package com.example.apiRest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiRest.models.TodasLasActividadesModel;
import com.example.apiRest.services.TodasLasActividadesService;

@RestController
@RequestMapping("/todaslasactividades")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TodasLasActividadesController {
    
    @Autowired
    private TodasLasActividadesService todasLasActividadesService;

    @GetMapping("/todaslasactividadesPrueba")
    public String getTodasLasActividades2(){
        return "Hola mundo";
    }

    @GetMapping
    public ArrayList<TodasLasActividadesModel> getTodasLasActividades(){
        return this.todasLasActividadesService.getTodasLasActividades();
    }
}
