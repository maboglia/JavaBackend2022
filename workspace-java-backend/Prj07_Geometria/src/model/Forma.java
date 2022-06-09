package model;

public abstract class Forma {

	protected String nomeForma;

	public Forma(String nomeForma) {
		this.nomeForma = nomeForma;
	}

	public abstract double perimetro();
	public abstract double superficie();
	
	@Override
	public String toString() {
		return "Forma [nomeForma=" + nomeForma 
				+ " perimetro: " + perimetro() 
				+ " superficie: " + superficie() 
				+ "]";
	}
	
	
	
	
	
	
	
}
