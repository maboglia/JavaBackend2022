package com.boglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boglia.services.LibroService;

@Controller
public class LibreriaMVC {

	@Autowired
	private LibroService service;
	
	@GetMapping
	public String getLibri(Model m) {
		m.addAttribute("elencoLibri",service.getAll());
		return "elenco";
	}
	
}
