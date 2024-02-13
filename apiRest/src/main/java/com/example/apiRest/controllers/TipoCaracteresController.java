package com.example.apiRest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiRest.models.TipoCaracteresModel;
import com.example.apiRest.services.TipoCaracteresService;

@RestController
@RequestMapping("/tipocaracteres")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TipoCaracteresController {
    
    @Autowired
    private TipoCaracteresService tipoCaracteresService;

    @GetMapping("/tipocaracteresPrueba")
    public String getTipoCaracteres2(){
        return "Hola mundo";
    }

    @GetMapping
    public ArrayList<TipoCaracteresModel> getTipoCaracteres(){
        return this.tipoCaracteresService.getTipoCaracteres();
    }
}
