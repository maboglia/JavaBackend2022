package agenda;

public class ProvaAgenda {

	public static void main(String[] args) {
		
		Impegno i1 = new Impegno("Java");
		Impegno i2 = new Impegno("PHP");
		Impegno i3 = new Impegno("C#");
		Impegno i4 = new Impegno("JavaScript");
		Impegno i5 = new Impegno("Python");
		
		Pagina p1 = new Pagina("Lunedì", new Impegno[]{i1, i2, i3});
		Pagina p2 = new Pagina("Mercoledì", new Impegno[]{i1, i2, i3, i4, i5});
		Pagina p3 = new Pagina("Venerdì", new Impegno[]{i5, i3, i2});
		
		Settimana s1 = new Settimana();
		
		s1.pagine[0] = p1;
		s1.pagine[1] = p2;
		s1.pagine[2] = p3;

		for(int i = 0; i <3; i++) {
			
			System.out.println(s1.pagine[i].stampaPagina());
			
			System.out.println("--------------------------------------------------------");
		}
		
	}

}
