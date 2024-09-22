package com.web.app.service;

import java.util.List;

import com.web.app.entity.Autor;
import com.web.app.entity.Libro;



public interface ILibroService {

	public List<Libro> listar_libros();
	public void guardar_libro(Libro libro,Autor autor);
	//public Optional<Producto> get (Integer id);
	public Libro buscarPorId(Integer id);
	public void actualizar_libro (Libro libro);
	public void eliminar_libro (Integer id);
	
}
