package com.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.entity.Autor;
import com.web.app.repository.AutorRepository;


@Service
public class AutorServiceImpl implements IAutorService {

	
	//declaramos un objeto de tipo autorrepositorio para inyectar la dependencia
		@Autowired
		private AutorRepository objeto_autor_repositorio;
	
	
	
	
	@Override
	public List<Autor> listar_autores() {
		
		return  (List<Autor>) objeto_autor_repositorio.findAll();
	}

	@Override
	public void guardar_autor(Autor autor) {
		objeto_autor_repositorio.save(autor);
	}

	@Override
	public Autor buscarPorId(Integer id) {
		
		return objeto_autor_repositorio.findById(id).orElse(null);
	}

	@Override
	public void actualizar_autor(Autor autor) {
		objeto_autor_repositorio.save(autor);
	}

	@Override
	public void eliminar_autor(Integer id) {
	    objeto_autor_repositorio.deleteById(id);

	}

}
