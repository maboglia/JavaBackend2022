package collezioni;

public enum Colore {
	ROSSO("#FF0000"), VERDE("#00FF00"), BLU("#0000FF"), GIALLO("yellow");
	
	private String esadecimale;
	
	
	private Colore(String esa) {
		this.esadecimale = esa;
	}
	
	public String etichetta() {
		return this + " (" + this.esadecimale + ")";
	}
}
