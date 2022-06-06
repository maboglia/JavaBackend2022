package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Studente;

public class ProvaStudenti {

	public static void main(String[] args) {


		File f = new File("files/studenti.txt");
		
//		System.out.println(System.lineSeparator());
		
		Studente[] registro = new Studente[11];
		int i = 0;
		
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				
				String[] parole = sc.nextLine().split(",");
				
				String nome = parole[0];
				String cognome = parole[1];
				
				Studente s = new Studente(nome, cognome);
				
				registro[i++] = s; 
 				
				//System.out.println(sc.nextLine());

			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}

		
		for (Studente studente : registro) {
			System.out.println(studente.stampa());
		}
		
		System.out.println("funge");

	}

}
