package com.example.apiRest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.apiRest.models.ActividadesIngresadasModel;

@Repository
public interface IActividadesIngesadasRepository extends JpaRepository<ActividadesIngresadasModel, Long>{    

     @Query("SELECT ai FROM ActividadesIngresadasModel ai " +
           "JOIN FETCH ai.domicilioAsociado d " +
           "JOIN FETCH ai.actividadAsociada t " +
           "WHERE ai.operacion_id = d.id")
    List<ActividadesIngresadasModel> findwithDomiciliosAndTodasLasActividades();
}
