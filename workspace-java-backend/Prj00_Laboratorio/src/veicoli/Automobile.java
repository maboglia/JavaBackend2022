package veicoli;

public class Automobile {

	//proprietà della classe
	static int contatore = 1;
	
	//proprietà dell'oggetto
	String marca;
	String modello;
	int cilindrata;
	int targa;
	
	public Automobile(String marca, String modello, int cilindrata) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.targa = contatore++;
	}
	
	public String stampa() {
		return "L'automobile " + marca + " " + modello + " targata: " + targa;
	}
	
}
