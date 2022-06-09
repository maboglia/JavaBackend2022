package model;

public class Rettangolo extends Forma {

	private Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		super("rettangolo");
		this.base = base;
		this.altezza = altezza;
	}
	
	

	@Override
	public double superficie() {
		
		return base.lunghezza() * altezza.lunghezza();
	}



	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return  2 * (base.lunghezza() + altezza.lunghezza());
	}
	
	
	
	
}
