package com.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.app.entity.Autor;
import com.web.app.service.IAutorService;

@Controller
@RequestMapping("views/autores") // hay una carpeta en views que se llama autores
public class AutorController {

	@Autowired
	private IAutorService autorservice;
	
	@GetMapping("/")
	public String listarAutores(Model model) {
		List<Autor> listadoAutores = autorservice.listar_autores();
		model.addAttribute("var_autores",listadoAutores);
		model.addAttribute("titulo", "Lista de Autores");
		return "/views/autores/lista_autores";
	}
	
}
