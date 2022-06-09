package model;

public class Canzone {

	private int posizione;
	private int posPrecedente;
	private int numeroSettimane;
	private String titolo;
	private String cantante;

	public Canzone() {
		System.out.println("oggetto costruito");
	}

	public Canzone(String titolo) {// overload dei costruttori
		System.out.println("oggetto costruito");
		this.titolo = titolo;
	}

	public Canzone(int posizione, int posPrecedente, int numeroSettimane, String titolo, String cantante) {
		this.posizione = posizione;
		this.posPrecedente = posPrecedente;
		this.numeroSettimane = numeroSettimane;
		this.titolo = titolo;
		this.cantante = cantante;
		System.out.println("oggetto costruito");
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	public int getPosPrecedente() {
		return posPrecedente;
	}

	public void setPosPrecedente(int posPrecedente) {
		this.posPrecedente = posPrecedente;
	}

	public int getNumeroSettimane() {
		return numeroSettimane;
	}

	public void setNumeroSettimane(int numeroSettimane) {
		this.numeroSettimane = numeroSettimane;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	
	

}
