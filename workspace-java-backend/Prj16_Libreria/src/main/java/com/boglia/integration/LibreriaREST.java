package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entitties.Libro;
import com.boglia.services.LibroService;

@RestController
public class LibreriaREST {

	@Autowired
	private LibroService service;
	
	@GetMapping
	public List<Libro> getAll(){
		return service.getAll();
	}
	
	@PostMapping
	public Libro addLibro(@RequestBody Libro l) {
		System.out.println("libro aggiunto");
		return service.addLibro(l);
	}
	
	
}
