package collezioni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Gioiello implements Comparable<Gioiello> {

	String materiale;
	double peso;
	double prezzo;

	public Gioiello(String materiale, double peso, double prezzo) {
		super();
		this.materiale = materiale;
		this.peso = peso;
		this.prezzo = prezzo;

	}

	@Override
	public String toString() {
		return "Gioiello [materiale=" + materiale + ", peso=" + peso + ", prezzo=" + prezzo + ", prezzo di vendita="
				+ calcolaPrezzo() + "]";
	}

	public double calcolaPrezzo() {

		return this.peso * this.prezzo;

	}

	@Override
	public int compareTo(Gioiello o) {
		return Double.compare(this.peso, o.peso);
	}

}

public class CollezioneGioielli {

	public static void main(String[] args) {

		ArrayList<Gioiello> gioielli = new ArrayList<>();
		Gioiello g1 = new Gioiello("oro", 1500, 37);
		Gioiello g2 = new Gioiello("argento", 2500, 25);
		Gioiello g3 = new Gioiello("platino", 1000, 45);

		gioielli.addAll(List.of(g1, g2, g3));

		double collezione = 0;

		Collections.sort(gioielli);

		Collections.sort(gioielli, (o1, o2) -> {

			if (o1.calcolaPrezzo() > o2.calcolaPrezzo()) {

				return 1;

			} else if (o1.calcolaPrezzo() < o2.calcolaPrezzo()) {

				return -1;

			}

			return 0;

		});

		for (Gioiello gioiello : gioielli) {
			System.out.println(gioiello);
			collezione += gioiello.calcolaPrezzo();
		}

		System.out.println("La tua collezione vale: " + collezione);

	}

}
