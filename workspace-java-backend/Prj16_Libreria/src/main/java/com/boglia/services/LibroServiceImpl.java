package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entitties.Libro;
import com.boglia.repos.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO repo; //IOC - inversion of control
	
	@Override
	public List<Libro> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Libro getLibroById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Libro> getLibroByTitolo(String parola) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro addLibro(Libro l) {
		return repo.save(l);
	}

	@Override
	public void deleteLibro(int id) {
		repo.deleteById(id);

	}

	@Override
	public Libro updateLibro(Libro l) {
		return repo.save(l);
	}

}
