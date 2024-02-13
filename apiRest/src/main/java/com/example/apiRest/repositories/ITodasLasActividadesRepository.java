package com.example.apiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRest.models.TodasLasActividadesModel;

@Repository
public interface ITodasLasActividadesRepository extends JpaRepository<TodasLasActividadesModel, Long>{
   
}
