package com.empleos.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.empleos.model.Vacante;

public interface IVacancesService {
	
	List<Vacante> buscarTodas();
	
	Vacante buscarPorId(Integer id);
	
	void guardar(Vacante vacante);

	List<Vacante> buscarDestacadas();
	
	void eliminar(Integer idVacante);
	
	List<Vacante> buscarByExample(Example<Vacante> example);
	
	Page<Vacante> buscarTodas(Pageable page);
	
}
