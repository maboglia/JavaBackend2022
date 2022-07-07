package collezioni;

public enum Materiale {

	VETRO(1.5), CERAMICA(2.5), ORO(15);
	
	private double prezzo;
	
	private Materiale(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
}
