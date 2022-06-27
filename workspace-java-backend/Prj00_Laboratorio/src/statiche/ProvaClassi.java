package statiche;

public class ProvaClassi {

	public static void main(String[] args) {
		ClasseIstanziabile oggetto = new ClasseIstanziabile();
		ClasseIstanziabile oggetto2 = new ClasseIstanziabile();
		oggetto2.saluto = "salve";
		System.out.println(oggetto.saluto);
		System.out.println(oggetto2.saluto);
		
		//proprietà static
		System.out.println(ClasseNonIstanziabile.saluto);
		ClasseNonIstanziabile ci = new ClasseNonIstanziabile();
		ci.saluto = "hola";
		ClasseNonIstanziabile.saluto= "bonjour";
		System.out.println(ci.saluto);
		
	}

}
