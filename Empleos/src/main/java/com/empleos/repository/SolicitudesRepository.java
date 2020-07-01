package com.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empleos.model.Solicitud;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
