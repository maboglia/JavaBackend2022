package controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Canzone;

public class CanzoniCtrl {

	
//	private Canzone[] elenco;
	private ArrayList<Canzone> elenco;
	
	public CanzoniCtrl() {
		System.out.println("controller costruito");
		this.elenco = new ArrayList<>();
		init();
	}
	
	private void init() {
		
		try {
			Scanner sc = new Scanner(new File("files\\canzoni.csv"));
			
			
			while (sc.hasNextLine()) {
				String[] string = sc.nextLine().split(",");
				
				Canzone c = new Canzone();
//				c.setPosizione( Integer.parseInt(string[0]));
//				c.setPosPrecedente(Integer.parseInt(string[1]));
//				c.setNumeroSettimane(Integer.parseInt(string[2]));
				c.setTitolo(string[3]);
				c.setCantante(string[4]);
				
				this.elenco.add(c);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ArrayList<Canzone> getElenco() {
		return elenco;
	}
	
	
}
