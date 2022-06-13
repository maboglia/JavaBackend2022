package model;

public class Impiegato extends Dipendente {

	private int oreLavorate;
	private double pagaBase;
	
	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
		
	}

	public int getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(int oreLavorate) {
		this.oreLavorate = oreLavorate;
	}

	public double getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(double pagaBase) {
		this.pagaBase = pagaBase;
	}

	@Override
	public double calcolaPaga() {
		return oreLavorate * pagaBase;
	}
	
	

}
