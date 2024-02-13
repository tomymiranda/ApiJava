package com.example.apiRest.controllers;

import java.util.ArrayList;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apiRest.models.DomicilioModel;
import com.example.apiRest.services.DomicilioService;

@RestController
@RequestMapping("/domicilios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DomicilioController {
    
    @Autowired
    private DomicilioService domicilioService;

    @GetMapping("/domiciliosPrueba")
    public String getDomicilios2(){
        return "Hola mundo";
    }

    @GetMapping
    public ArrayList<DomicilioModel> getDomicilios(){
        return this.domicilioService.getDomicilios();
    }

    @GetMapping("/domiciliosOrdenados")
    public List<DomicilioModel> getDomiciliosOrdenadosPorFecha() {
        return this.domicilioService.getDomiciliosOrdenadosPorFecha();
    }
    @GetMapping("/domiciliosAndActividadesAndCaracteres")
    public List<Object[]> getDomiciliosAndActividadesAndCaracteres() {
        return domicilioService.getDomiciliosAndActividadesAndCaracteres();
    }
}
