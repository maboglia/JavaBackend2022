package model;

public class Dirigente extends Dipendente {

	private int giornate;
	private double pagaGiornata;
	
	
	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	
	public int getGiornate() {
		return giornate;
	}

	public void setGiornate(int giornate) {
		this.giornate = giornate;
	}

	public double getPagaGiornata() {
		return pagaGiornata;
	}

	public void setPagaGiornata(double pagaGiornata) {
		this.pagaGiornata = pagaGiornata;
	}

	@Override
	public double calcolaPaga() {
		// TODO Auto-generated method stub
		return giornate * pagaGiornata;
	}

}
