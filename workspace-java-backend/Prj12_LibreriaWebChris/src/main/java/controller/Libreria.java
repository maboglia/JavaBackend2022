package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Libro;
import repos.LibroDAOImpl;

public class Libreria {

	private List<Libro> libri;
	private LibroDAOImpl dao;

	public Libreria() {
		this.libri = new ArrayList<>();
		System.out.println("Libreria costruita");
		this.dao = new LibroDAOImpl();
	}

	public void addLibro(Libro l) {
		this.dao.addLibro(l);
		//this.libri.add(l);

	}

	public List<Libro> getLibri() {
		return dao.getLibri();
	}

	public Libro getLibroById(int id) {

		for (Libro libro : libri) {
			if (libro.getId() == id)
				return libro;
		}
		return null;

	}

	public Libro getLibroFunc(int id) {

		return libri.stream().filter(l -> l.getId() == id)
				.collect(Collectors.toList()).get(0);

	}

	public void updateLibro(Libro l) {

		if (libri.contains(l)) {

			Libro libroById = getLibroById(l.getId());
			libroById = l;
			System.out.println("Libro modificato");
		}
	}

	public void removeLibro(Libro l) {

		libri.remove(l);
		System.out.println("Libro eliminato");

	}

}
	
	

