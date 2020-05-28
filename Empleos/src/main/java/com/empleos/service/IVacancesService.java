package com.empleos.service;

import java.util.List;

import com.empleos.model.Vacante;

public interface IVacancesService {
	
	List<Vacante> buscarTodas();
	
	Vacante buscarPorId(Integer id);
	
	void guardar(Vacante vacante);

}
