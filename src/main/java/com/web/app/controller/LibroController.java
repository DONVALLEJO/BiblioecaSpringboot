package com.web.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.app.entity.Autor;
import com.web.app.entity.Libro;
import com.web.app.service.IAutorService;
import com.web.app.service.ILibroService;



@Controller
@RequestMapping("libros") // hay una carpeta en views que se llama libros
public class LibroController {
	
	
	
	
	@Autowired
	private ILibroService libroservice;
	
	@Autowired
	private IAutorService autorservice;
	
	private final static Logger LOGGER = LoggerFactory.getLogger(LibroController.class);
	
	@GetMapping("/")
	public String listarlibros(Model model) {
		List<Libro> listadoLibros = libroservice.listar_libros();
		model.addAttribute("var_libro",listadoLibros);
		model.addAttribute("titulo", "Lista de Libros");
		LOGGER.info("ESTE ES EL OBJETO DEL LIBRO {}",listadoLibros);
		return "/views/libros/lista_libros";
	}
	
	

	@GetMapping("/create_libro")
	public String Crear_Libro(Model model) {		
		
		List<Autor> listadoautores = autorservice.listar_autores();
		model.addAttribute("titulo_crear", "Crear Libro");
		model.addAttribute("var_autores",listadoautores);
		LOGGER.info("ESTE ES EL OBJETO DEL LIBRO {}",listadoautores);
				
		//return "/views/libros/frm_crear_libro";
		return "/views/libros/frm_crear_libro";
	}
	
	
	

}
