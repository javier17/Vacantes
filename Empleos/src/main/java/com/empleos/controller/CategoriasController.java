package com.empleos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.empleos.model.Categoria;
import com.empleos.service.ICategoriasService;

@Controller
@RequestMapping(value = "/categorias")
public class CategoriasController {
	
	@Autowired
	private ICategoriasService serviceCategoria;

	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Categoria> lista = serviceCategoria.buscarTodas();
		model.addAttribute("vategorias",lista);
		return "categorias/listCategorias";
	}
	
	@GetMapping("/create")
	public String crear() {
		return "categorias/formCategoria";
	}
	
	@PostMapping("/save")
	public String guardar(Categoria categoria, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			for (ObjectError error : result.getAllErrors()) {
				System.out.println("Ocurrio el error: "+error.getDefaultMessage());
			}
			return "categorias/formCategoria";
		}
		serviceCategoria.guardar(categoria);
		attributes.addFlashAttribute("msg","Registro Guardado");
		System.out.println("Categoria: "+categoria);
		return "redirect:/categorias/index";
	}
	
	/*
	@PostMapping("/save")
	public String guardar(@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion) {
		System.out.println("Categoria: "+nombre);
		System.out.println("descripcion: "+descripcion);
		return "categorias/listCategorias";
	}
	*/
	
}
