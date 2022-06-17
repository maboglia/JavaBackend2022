package functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProvaFunctional {

	public static void main(String[] args) {
		
		String[] prodottiArray = {"mac book", "dell", "IBM", "sony"}; 
		
		List<String> prodotti = Arrays.asList(prodottiArray);
		
//		for (int i = 0; i < prodotti.size(); i++) {
//			System.out.println(prodotti.get(i));
//		}
//		
//		for (String prodotto : prodotti) {
//			System.out.println(prodotto);
//		}
		

		List<String>  prodotti2 = 
		prodotti
			.stream()
//			.skip(2)
			.filter(p -> p.length() > 3)//intermedie
			.sorted()//intermedie
			.collect(Collectors.toList());
//			.forEach(p -> System.out.println(p));//terminale
		
	}

}
