package model;

public class Studente {

	static int counter = 1;
	
	int nMatricola;
	String nome;
	String cognome;
	
	public Studente(String nome, String cognome) {

		this.nMatricola = counter++;
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Studente [nMatricola=" + nMatricola + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
}
