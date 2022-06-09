package view;



import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class ProvaGeometria {

	public static void main(String[] args) {

		Punto a = new Punto(2,1);
		Punto b = new Punto(6,1);
		Punto c = new Punto(2,4);
		
		
		Segmento ab = new Segmento(a, b);
		Segmento ac = new Segmento(a, c);
		
		Triangolo t1 = new Triangolo(a, b, c);
		
		Rettangolo r1 = new Rettangolo(ab, ac);
		
		Quadrato q1 = new Quadrato(ac); 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(ab.lunghezza());
		
		System.out.println(t1);
		System.out.println("Perimetro: " + t1.perimetro());
		System.out.println("Area: " + t1.superficie());
		
		System.out.println(r1);
		System.out.println("Perimetro: " + r1.perimetro());
		System.out.println("Area: " + r1.superficie());
		
		System.out.println(q1);
		
		
		

	}

}
