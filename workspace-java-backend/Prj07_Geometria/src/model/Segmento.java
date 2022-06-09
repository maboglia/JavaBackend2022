package model;

public class Segmento {

	private Punto a, b;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + "]";
	}
	
	public double lunghezza() {

		
		 return Math.sqrt(  
				 Math.pow( a.getX() - b.getX()   , 2) + 
				 Math.pow( a.getY() - b.getY() , 2) 
				 );
		
	}
	
	
}
