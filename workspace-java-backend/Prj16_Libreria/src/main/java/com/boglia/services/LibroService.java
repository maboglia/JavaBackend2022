package com.boglia.services;

import java.util.List;

import com.boglia.entitties.Libro;

public interface LibroService {

	List<Libro> getAll();
	Libro getLibroById(int id);
	
	List<Libro> getLibroByTitolo(String parola);
	
	Libro addLibro(Libro l);
	
	void deleteLibro(int id);
	Libro updateLibro(Libro l);
}
