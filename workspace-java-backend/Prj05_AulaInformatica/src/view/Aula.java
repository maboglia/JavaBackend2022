package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Registro;
import model.Studente;

public class Aula {

	public static void main(String[] args) {
		
		
		Registro r1 = new Registro("Java Backend", 11);
		
		
		File f = new File("C:\\Users\\teacher\\Desktop\\studenti.txt");
		
		try {
			Scanner sc = new Scanner(f);
			
			int i = 0;
			
			while(sc.hasNextLine()) {
				
				String[] split = sc.nextLine().split(",");
				
				String nome = split[0];
				String cognome = split[1];
				
				Studente temp = new Studente(nome, cognome);
				
				r1.addStudente(temp, i++);
				
				
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Il corso è denominato");
		System.out.println(r1.getCorso());
		
		System.out.println("Elenco studenti iscritti");
		
		for(Studente s: r1.getElenco()) {
			System.out.println(s);
		}
		
		
		System.out.println("appello");
		
		Scanner sc = new Scanner(System.in);
		
		int presenti = 0, assenti = 0;
		
		for(Studente s: r1.getElenco()) {
		
			System.out.println("E' presente lo studente?");
			
			System.out.println(s);
			
			String risposta = sc.nextLine();
			
			if (risposta.equalsIgnoreCase("S")) {
				presenti++;
			} else {
				assenti++;
			}
		}
		
		System.out.println("sono presenti " + presenti);
		System.out.println("sono assenti " + assenti);
		
		
		

	}

}
