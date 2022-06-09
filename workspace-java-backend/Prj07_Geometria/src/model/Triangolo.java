package model;

public class Triangolo extends Forma {

	//stato interno
	private Punto a, b, c;
	private Segmento ab, ac, bc;

	
	//metodi costruttori
	public Triangolo(Punto a, Punto b, Punto c) {
		super("triangolo");
		this.a = a;
		this.b = b;
		this.c = c;

		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
	
	}

	//metodi getters - accessori
	public Segmento getAb() {
		return ab;
	}

	public Segmento getAc() {
		return ac;
	}

	public Segmento getBc() {
		return bc;
	}
	
	public double perimetro() {
		return this.ab.lunghezza()  + this.ac.lunghezza() + this.bc.lunghezza();
	}
	
	public double superficie() {
	
		double sp = perimetro() / 2;
		
		double superficie = Math.sqrt(sp * (sp-ab.lunghezza()) * (sp - ac.lunghezza()) * (sp - bc.lunghezza()));  
		
		return superficie;
		
	}
	
}
