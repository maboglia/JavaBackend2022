package com.didaz.todos.services;

import java.util.List;

import com.didaz.todos.entities.Todo;

public interface TodoService {
	
	Todo addTodo(Todo t); 
	
	Todo updateTodo(Todo t); 
	
	void deleteTodo(int id);
	
	Todo getTodoById(int id);
	
	List<Todo> getTodos();

	List<Todo> getTodoCompletati();
	
	List<Todo> getTodoIncompleti();
	
	List<Todo> getTodoByDescription(String descrizione);
}
