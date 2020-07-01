package com.empleos.service;

import java.util.List;

import com.empleos.model.Usuario;

public interface IUsuariosService {

	/** Ejercicio: Implementar método para registrar un usuario nuevo
	 * 1. Usar la plantilla del archivo formRegistro.html
	 * 2. El método para mostrar el formulario de registrar y el método para guardar el usuario deberá
	 * 		estar en el controlador HomeController
	 * 3. Al guardar el usuario se le asignará el perfil USUARIO y la fecha de registro será la fecha actual de sistema.
	 */
	
	void guardar(Usuario usuario);
	
	//Ejercicio: método que elimina un usuario de la base de datos
	void eliminar(Integer idUsuario);
	
	//Ejercicio: Implementar método que recupera los usuarios. Usar vista de listUsuarios.html
	List<Usuario> buscarTodos();
	
	Usuario buscarPorUsername(String username);
	
}

// Agregar al archivo menu.html el link para acceder al listado de Usuarios y configurar el link del botón Registrarse
