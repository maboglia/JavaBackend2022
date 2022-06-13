package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ProvaEsami {

	
	public static void main(String[] args) {
		
		
		Integer[] voti = {25,24,26,30,28,29,30,18};
		
		Collection<Integer> votiLista = new LinkedList<>(Arrays.asList(voti));

		
		for (Integer voto : votiLista) {
			System.out.println(voto);
		}
		
		System.out.println("-----------------------------------");
		
		Collection<Integer> votiSet = new HashSet<>(votiLista);
		
		for (Integer voto : votiSet) {
			System.out.println(voto);
		}
		
		
		System.out.println("-----------------------------------");
		
		Collection<Integer> votiTreeSet = new TreeSet<>(votiLista);
		
		for (Integer voto : votiTreeSet) {
			System.out.println(voto);
		}
		
		
	}
	
	
	
}
