package model;

public abstract class Dipendente {

	private static int matricolatore = 1;
	
	private String nome;
	private String cognome;
	private int matricola;
	
	public Dipendente(String nome, String cognome) {
		this.matricola = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	
	public abstract double calcolaPaga();
	
	
}
