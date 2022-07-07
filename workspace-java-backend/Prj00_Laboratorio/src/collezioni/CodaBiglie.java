package collezioni;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class CodaBiglie {

	public static void main(String[] args) {

		Deque<Biglia> biglie = new ArrayDeque<>(BiglieDAO.collezione);
		
		//Pila FIFO - LIFO
		
//		System.out.println(biglie.peek());//ritorna e NON rimuove
//		System.out.println(biglie.element());//ritorna e NON rimuove
		System.out.println(biglie.poll());//ritorna e rimuove
		biglie.add(new Biglia(Colore.ROSSO, 30, Materiale.CERAMICA));
		biglie.offer(new Biglia(Colore.VERDE, 40, Materiale.VETRO));
		System.out.println("-----Elenco-------");
		biglie.forEach(System.out::println);

		
		
		
		
	}

}
