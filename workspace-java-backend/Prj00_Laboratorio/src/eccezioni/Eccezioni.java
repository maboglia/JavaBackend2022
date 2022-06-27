package eccezioni;

import java.util.List;

public class Eccezioni {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, BenzinaFinitaException {


//		List<String> note = List.of("do", "re", "mi", "fa", "sol", "la", "si");
//		
//		Object[] array = note.toArray();
//		
////		try {
////			System.out.println(array[7]);
////		} catch (ArrayIndexOutOfBoundsException e) {
////			System.err.println(e.getMessage());
////			System.out.println("Nota non disponibile");
////		}
////		
//		System.out.println(array[7]);
//		
//		for (Object object : array) {
//			System.out.println(object);
//		}

		int lt = 16;
		
		int km = 10;
		
		int kmlt = 5;
		
		try {
			for (int i = 0; i < km; i++) {
				if (i * kmlt > lt) {
					throw new BenzinaFinitaException();
				}
				System.out.println("l'auto va");
				
			}
		} catch (BenzinaFinitaException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			System.out.println("auto ferma");
		}

		System.out.println("viaggio terminato");
	}

}
