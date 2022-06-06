package model;

public class Studente {

	static int matricolatore = 1;
	
	int nMatricola;
	String nome;
	String cognome;

	public Studente(String nome, String cognome) {
		this.nMatricola = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String stampa() {
		return this.nMatricola + ") " + this.nome + " " + this.cognome.toUpperCase();
	}
	
	
	
}
