package com.example.apiRest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiRest.models.ObservacionesModel;
import com.example.apiRest.services.ObservacionesService;

@RestController
@RequestMapping("/observaciones")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ObservacionesController {
    
    @Autowired
    private ObservacionesService observacionesService;
    
    @GetMapping("/observacionesPrueba")
    public String getObservaciones2(){
        return "Hola mundo";
    }

    @GetMapping
    public ArrayList<ObservacionesModel> getObservaciones(){
        return this.observacionesService.getObservaciones();
    }
}
