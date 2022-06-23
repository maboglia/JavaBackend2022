package model;

public class Libro extends Oggetto {

	public Libro(String nome, double prezzo) {
		super(nome, prezzo);
		this.tipo = "libro";
	}

}
