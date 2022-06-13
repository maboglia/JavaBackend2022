package controller;

import java.util.ArrayList;
import java.util.List;

import model.Todo;

public class TodoCtrl {

	private List<Todo> lista;

	public TodoCtrl() {
		this.lista = new ArrayList<>();
	}
	
	public void addTodo(String descrizione) {
		Todo t = new Todo(descrizione);
		lista.add(t);
	}
	
	public void addTodo(Todo t) {
		lista.add(t);
	}
	
	public void completa(int i) {
		lista.get(i).setCompletato(true);
	}
	
	public List<Todo> getLista() {
		return lista;
	}
	
	
}
