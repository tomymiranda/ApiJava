package com.example.apiRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiRest.models.ActividadesIngresadasModel;
import com.example.apiRest.services.ActividadesIngresadasService;

import java.util.List;

@RestController
@RequestMapping("/actividadesIngresadas")
public class ActividadesIngresadasController {
    
    @Autowired
    private ActividadesIngresadasService actividadesIngresadasService;

    @GetMapping("/findWithDomiciliosAndTodasLasActividades")
    public List<ActividadesIngresadasModel> findwithDomiciliosAndTodasLasActividades() {
        return actividadesIngresadasService.findwithDomiciliosAndTodasLasActividades();
    }
}

