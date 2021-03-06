package model;

public class Studente {

	static int matricolatore = 1;
	
	int nMatricola;
	String nome;
	public String cognome;

	public Studente(String nome, String cognome) {
		this.nMatricola = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String stampa() {
		return this.nMatricola + ") " + this.nome + " " + this.cognome.toUpperCase();
	}

	@Override
	public String toString() {
		return "Studente [nMatricola=" + nMatricola + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
}
