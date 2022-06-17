package functional;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Esame {
	String nome;
	int voto;

	public Esame(String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}

	@Override
	public String toString() {
		return "Esame [nome=" + nome + ", voto=" + voto + "]";
	}
	
}

public class ProvaEsami {

	public static void main(String[] args) {

		List<Esame> esami = List.of(
				new Esame("java", 28), 
				new Esame("php", 30), 
				new Esame("javascript", 17), 
				new Esame("c#", 25) );

		 IntSummaryStatistics summaryStatistics = esami
			.stream()
			.filter(e -> e.voto >= 18)
			.mapToInt(e -> e.voto)
			.map(v -> v+3)
			.summaryStatistics();
		
		 		 
		 
		 
		System.out.println(summaryStatistics);
	}

}
