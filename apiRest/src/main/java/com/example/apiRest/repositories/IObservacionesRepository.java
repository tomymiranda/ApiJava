package com.example.apiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRest.models.ObservacionesModel;

@Repository
public interface IObservacionesRepository extends JpaRepository<ObservacionesModel, Long>{

}

