package veicoli;

public class Automobile {

	String marca;
	String modello;
	int cilindrata;
	
	public Automobile(String marca, String modello, int cilindrata) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
	}
	
	public String stampa() {
		return "L'automobile " + marca + " " + modello ;
	}
	
}
