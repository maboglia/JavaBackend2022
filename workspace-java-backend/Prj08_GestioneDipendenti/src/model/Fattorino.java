package model;

public class Fattorino extends Dipendente {

	private int nConsegne;
	private double pagaConsegne;
	
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	
	public int getnConsegne() {
		return nConsegne;
	}

	public void setnConsegne(int nConsegne) {
		this.nConsegne = nConsegne;
	}

	public double getPagaConsegne() {
		return pagaConsegne;
	}

	public void setPagaConsegne(double pagaConsegne) {
		this.pagaConsegne = pagaConsegne;
	}

	@Override
	public double calcolaPaga() {
		// TODO Auto-generated method stub
		return nConsegne * pagaConsegne;
	}

}
