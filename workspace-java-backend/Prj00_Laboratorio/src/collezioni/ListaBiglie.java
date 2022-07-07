package collezioni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;



public class ListaBiglie {

	public static void main(String[] args) {

		List<Biglia> biglie = BiglieDAO.collezione;

		List<Biglia> biglieVerdi = biglie
			.stream()
			.filter(b -> b.getColore().equals(Colore.VERDE))
			.collect(Collectors.toList());
		
		biglieVerdi.forEach(b -> System.out.println(b));
		
		biglieVerdi.forEach(System.out::println);
		
		for (int i = 0; i < biglie.size(); i++) {
			System.out.println(i + " " + biglie.get(i));
		}
		
		}
		
	

}
