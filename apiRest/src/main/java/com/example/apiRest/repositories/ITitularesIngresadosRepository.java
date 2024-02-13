package com.example.apiRest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.apiRest.models.TitularesIngresadosModel;

public interface ITitularesIngresadosRepository extends JpaRepository<TitularesIngresadosModel, Long> {

    @Query("SELECT ti FROM TitularesIngresadosModel ti " +
       "JOIN FETCH ti.domicilioAsociado d " +
       "JOIN FETCH ti.caracterAsociado tc " +
       "WHERE ti.operacion_id = d.id")
    List<TitularesIngresadosModel> findTitularesIngresadosWithDomicilios();
    
}
