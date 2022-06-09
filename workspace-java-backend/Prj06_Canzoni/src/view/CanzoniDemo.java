package view;

import controller.CanzoniCtrl;
import model.Canzone;

public class CanzoniDemo {

	public static void main(String[] args) {

		CanzoniCtrl ctrl = new CanzoniCtrl();
		
		for (Canzone c :  ctrl.getElenco()) {
			System.out.println(c.getTitolo());
		}

	}

}
