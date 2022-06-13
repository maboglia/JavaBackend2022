package controller;

import java.util.ArrayList;
import java.util.List;

import database.TodoDAO;
import model.Todo;

public class TodoCtrl {

	private List<Todo> lista;
	private TodoDAO dao;

	public TodoCtrl() {
		this.lista = new ArrayList<>();
		this.dao = new TodoDAO();
	}
	
	public void addTodo(String descrizione) {
		Todo t = new Todo(descrizione);
		lista.add(t);
		this.dao.addTodo(t);
	}
	
	public void addTodo(Todo t) {
		lista.add(t);
		this.dao.addTodo(t);
	}
	
	public void completa(int i) {
		lista.get(i).setCompletato(true);
	}
	
	public List<Todo> getLista() {
		this.lista = this.dao.getTodo();
		
		return lista;
	}
	
	
}
