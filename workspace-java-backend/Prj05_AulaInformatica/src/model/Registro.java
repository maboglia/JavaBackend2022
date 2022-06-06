package model;

import java.util.Arrays;

public class Registro {

	
	String corso;
	Studente[] elenco;
	
	public Registro(String corso, int numStudenti) {
		
		this.corso = corso;
		this.elenco = new Studente[numStudenti];
		
	}
	
	public void addStudente(Studente s, int pos) {
		this.elenco[pos] = s;
	}
	
	public Studente[] getElenco() {
		return this.elenco;
	}
	
	public String getCorso() {
		return this.corso;
	}

	@Override
	public String toString() {
		return "Registro [corso=" + corso + ", \nelenco=" + Arrays.toString(elenco) + "]";
	}
	
	
	
}
