package collezioni;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBiglie {

	public static void main(String[] args) {
		
		Set<Biglia> biglie = new TreeSet<>(BiglieDAO.collezione);
		biglie.add(BiglieDAO.collezione.get(0));
		biglie.stream().forEach(System.out::println);
		
		for (Biglia biglia : biglie) {
			System.out.println(biglia.getColore().etichetta());
		}
		
		
	}

}
