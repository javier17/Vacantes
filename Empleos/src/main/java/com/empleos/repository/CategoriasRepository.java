package com.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empleos.model.Categoria;
//import org.springframework.data.repository.CrudRepository;

//public interface CateroriasRepository extends CrudRepository<Categoria, Integer> {

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

	
}
