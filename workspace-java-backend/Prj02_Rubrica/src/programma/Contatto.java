package programma;

public class Contatto {

	String nome;
	String cognome;
	String telefono;
	
	
	public String stampaContatto() {
		return nome.toUpperCase().charAt(0) + " " + cognome.toUpperCase() + " posizione: " +telefono;
	}
	
	
}
