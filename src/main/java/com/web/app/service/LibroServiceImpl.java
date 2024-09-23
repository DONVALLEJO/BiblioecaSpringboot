package com.web.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.entity.Autor;
import com.web.app.entity.Libro;

import com.web.app.repository.LibroRepository;

@Service
public class LibroServiceImpl implements ILibroService {

	
	//declaramos un objeto de tipo librorepositorio para inyectar la dependencia
			@Autowired
			private LibroRepository objeto_libro_repositorio;
			
	@Override
	public List<Libro> listar_libros() {		
		return (List<Libro>) objeto_libro_repositorio.findAll();
	}

	@Override
	public void guardar_libro(Libro libro, Autor autor) {
		//objeto_libro_repositorio.save(libro,autor);
		
	}

	@Override
	public Libro buscarPorId(Integer id) {
		
		return objeto_libro_repositorio.findById(id).orElse(null);
	}

	@Override
	public void actualizar_libro(Libro libro) {
		objeto_libro_repositorio.save(libro);
		
	}

	@Override
	public void eliminar_libro(Integer id) {
		objeto_libro_repositorio.deleteById(id);
		
	}

}
