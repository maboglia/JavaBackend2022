package programma;

public class ProvaRubrica {

	public static void main(String[] args) {

		Contatto c1 = new Contatto();
		c1.nome = "sabrina";
		c1.cognome = "aleotti";
		c1.telefono = "8";

		Contatto c2 = new Contatto();
		c2.nome = "francesco";
		c2.cognome = "barbieri";
		c2.telefono = "7";
		
		
		Rubrica r = new Rubrica();
		r.nomeRubrica = "studenti java backend";
		r.schedario[0] = c1;
		r.schedario[1] = c2;
		r.schedario[5] = c2;
		
		//modificato /// 
		r.stampaRubrica();
		
		
		
		

	}

}
