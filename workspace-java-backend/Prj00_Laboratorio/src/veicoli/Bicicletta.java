package veicoli;

public class Bicicletta {

	String colore;
	int marcia;
	int velocita;
	
	public Bicicletta(String colore){
		this.colore = colore;
		marcia = 1;
		velocita = 0;
		System.out.println("bici costruita");
	}
	
	public void cambia(int marcia) {
		this.marcia = marcia;
	}
	
	public String stampa() {
		return "La bici di colore" + colore
				+ " si trova in marcia " 
				+ marcia;
	}
	

}
