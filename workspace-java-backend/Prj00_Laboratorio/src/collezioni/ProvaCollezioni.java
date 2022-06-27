package collezioni;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ProvaCollezioni {

	public static void main(String[] args) {

		String[] musica = {"do", "re", "fa", "mi", "fa", "do"};
		
		Queue<String> note = new LinkedList<>(Arrays.asList(musica));
		
		note.stream().forEach(n -> System.out.println(n));
		
		System.out.println("---------------------------");
		
		Collection<String> noteSingole = new TreeSet<>(note); 
		
		List<String> note3 = 
				noteSingole
				.stream()
				.filter(n -> n.startsWith("d"))
				.collect(Collectors.toList());

	}

}
