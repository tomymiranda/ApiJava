package com.example.apiRest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.apiRest.models.DomicilioModel;

@Repository
public interface IDomicilioRepository extends JpaRepository<DomicilioModel, Long>{

@Query("SELECT d FROM DomicilioModel d ORDER BY d.fecha_operacion DESC")
List<DomicilioModel> findAllByOrderByFechaOperacionDesc();



@Query("SELECT d.cuit, t.cuit_titular, d.domicilio, t.operacion_id, a.codigo, a.descripcion, tc.caracter " +
"FROM DomicilioModel d " +
"JOIN d.titularesIngresados t " +
"JOIN t.caracterAsociado tc " +
"JOIN d.actividadesIngresadas ai " +
"JOIN ai.actividadAsociada a " +
"ORDER BY d.fecha_operacion DESC")
List<Object[]> findDomiciliosAndActividadesAndCaracteres();
} 