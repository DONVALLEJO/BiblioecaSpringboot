package com.web.app.service;

import java.util.List;
import java.util.Optional;

import com.web.app.entity.Autor;



public interface IAutorService {
	
	public List<Autor> listar_autores();
	public void guardar_autor(Autor autor);
	//public Optional<Producto> get (Integer id);
	public Autor buscarPorId(Integer id);
	public void actualizar_autor (Autor autor);
	public void eliminar_autor (Integer id);
	


}
