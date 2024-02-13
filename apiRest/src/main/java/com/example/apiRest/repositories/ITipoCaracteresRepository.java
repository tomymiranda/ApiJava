package com.example.apiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRest.models.TipoCaracteresModel;

@Repository
public interface ITipoCaracteresRepository extends JpaRepository<TipoCaracteresModel, Long>{
    

}
