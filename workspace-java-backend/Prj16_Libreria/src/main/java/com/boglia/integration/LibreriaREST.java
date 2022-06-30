package com.boglia.integration;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entitties.Libro;
import com.boglia.services.LibroService;

@RestController
@RequestMapping("api")
public class LibreriaREST {

	@Autowired
	private LibroService service;
	
	@GetMapping
	@CrossOrigin
	public List<Libro> getAll(){
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Libro getLibro(@PathVariable int id){
		return service.getLibroById(id);
	}
	
	@PostMapping
	public Libro addLibro(@RequestBody Libro l) {
		System.out.println("libro aggiunto");
		return service.addLibro(l);
	}
	
	
}
