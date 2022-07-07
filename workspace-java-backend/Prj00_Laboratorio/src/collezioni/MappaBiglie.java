package collezioni;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappaBiglie {

	public static void main(String[] args) {

		class Bambino{
			String nome;
			public Bambino(String nome) {
				this.nome = nome;
			}
		}
		
		Map<Integer, Biglia> biglie = new HashMap<>();
		
		Map<Bambino, List<Biglia>> bambini = new HashMap<>();
		
		
		
		
		
		int i = 0;
		for (Biglia b : BiglieDAO.collezione) {
			biglie.put(i++, b);
		}
		
		bambini.put(new Bambino("pierino"), List.of(biglie.get(0), biglie.get(1), biglie.get(2), biglie.get(3)));
		bambini.put(new Bambino("elon"), List.of(new Biglia(Colore.GIALLO, 50, Materiale.ORO), biglie.get(1), biglie.get(2), biglie.get(3)));
		bambini.put(new Bambino("giustino"), List.of(biglie.get(1), biglie.get(2), biglie.get(3)));
		
		//bambini.values().forEach(b -> System.out.println(b));
		
		
		for (var bambino : bambini.keySet()) {
			System.out.println(bambino.nome);
			System.out.println(bambini.get(bambino)
					.stream()
					.mapToDouble(b->b.getPrezzo())
					.sum()
					);
		}
		
		
		
		
		
		
		
//		biglie.keySet().forEach(System.out::println);
//		biglie.values().forEach(System.out::println);
//		biglie.entrySet().forEach(System.out::println);
		
		
		

	}

}
