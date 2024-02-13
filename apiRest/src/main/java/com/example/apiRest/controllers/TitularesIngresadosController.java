package com.example.apiRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.apiRest.models.TitularesIngresadosModel;
import com.example.apiRest.services.TitularesIngresadosService;

@RestController
@RequestMapping("/titularesIngresados")
public class TitularesIngresadosController {
    
    @Autowired
    private TitularesIngresadosService titularesIngresadosService;

    @GetMapping("/withDomicilios")
    public List<TitularesIngresadosModel> getTitularesIngresadosWithDomicilios() {
        return titularesIngresadosService.getTitularesIngresadosWithDomicilios();
    }

}
