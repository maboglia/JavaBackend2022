package main;

import java.util.List;
import java.util.Scanner;

import controller.TodoCtrl;
import model.Todo;

public class App {

	public static void main(String[] args) {


		TodoCtrl ctrl = new TodoCtrl();
		

		boolean gira = true;
		
		
		while(gira) {
			
			menu();
			int r = chiedi("cosa vuoi fare?");
			
			switch (r) {
			case 1:
				String desc = chiediStringa("Inserisci la descrizione");
				ctrl.addTodo(desc);
				break;
			case 2:
				for(Todo t:   ctrl.getLista()) {System.out.println(t);}
				break;
			case 3:
				gira = false;
				break;

			default:
				System.out.println("Opzione non disponibile, prova ancora!");
				break;
			}
			
			
		}
		
		System.out.println("Arrivederci, grazie per aver usato i nostri software :)");
		
		
		
		
		
	}

	private static String chiediStringa(String domanda) {
		System.out.println(domanda);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	private static int chiedi(String domanda) {
		System.out.println(domanda);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static void menu() {

		System.out.println("------------------------");
		System.out.println("1) Per aggiungere un nuovo todo");
		System.out.println("2) Per vedere la lista di todo");
		System.out.println("3) Per uscire");
		System.out.println("------------------------");
		
	}

}
