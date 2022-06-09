package model;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.nomeForma = "quadrato";
		this.lato = lato;
	}

	@Override
	public double superficie() {
		System.out.println("ho usato il metodo di q");
		return Math.pow(this.lato.lunghezza(), 2);
	}
	
	
	
}
