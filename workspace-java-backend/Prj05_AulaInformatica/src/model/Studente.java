package model;

/**
 * Questa classe definisce uno studente
 * @author teacher
 *
 */
public class Studente {

	static int counter = 1;
	
	int nMatricola;
	String nome;
	String cognome;
	
	/**
	 * Costruttore dello Studente
	 * @param nome passare come primo par il nome dello
	 * @param cognome knklhklòhsfaklhlsfkò
	 */
	public Studente(String nome, String cognome) {

		this.nMatricola = counter++;
		this.nome = nome;
		this.cognome = cognome;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Studente [nMatricola=" + nMatricola + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
}
