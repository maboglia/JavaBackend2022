package collezioni;

import java.util.Objects;

public class Biglia implements Comparable<Biglia> {

	private Colore colore;
	private int dimensione;
	private Materiale materiale;
	private double prezzo;
	
	public Biglia() {
	}

	public Biglia(Colore colore, int dimensione, Materiale materiale) {
		this.colore = colore;
		this.dimensione = dimensione;
		this.materiale = materiale;
	}

	public double getPrezzo() {
		return this.materiale.getPrezzo() * dimensione;
	}
	
	
	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	public int getDimensione() {
		return dimensione;
	}

	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}

	public Materiale getMateriale() {
		return materiale;
	}

	public void setMateriale(Materiale materiale) {
		this.materiale = materiale;
	}

	@Override
	public String toString() {
		return "Biglia [colore=" + colore + ", dimensione=" + dimensione + ", materiale=" + materiale + "]";
	}

	@Override
	public int compareTo(Biglia altraBiglia) {
		// TODO Auto-generated method stub
		return this.dimensione - altraBiglia.dimensione;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colore, dimensione, materiale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biglia other = (Biglia) obj;
		return colore == other.colore && dimensione == other.dimensione && materiale == other.materiale;
	}
	

	
	
	
}
