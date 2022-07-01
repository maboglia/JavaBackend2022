package com.didaz.todos.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didaz.todos.entities.Todo;
import com.didaz.todos.repos.TodoDAO;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoDAO repo; 
	
	
	@Override
	public Todo addTodo(Todo t) {
		return repo.save(t);
	}

	@Override
	public Todo updateTodo(Todo t) {
		return repo.save(t);
	}

	@Override
	public void deleteTodo(int id) {
		repo.deleteById(id);
		System.out.println("Record eliminato");
	}

	@Override
	public Todo getTodoById(int id) {
		if(repo.findById(id).isPresent()) {
	
			return repo.findById(id).get();
			
		}	return null;
	}

	@Override
	public List<Todo> getTodos() {
		
		return repo.findAll();
	}

	@Override
	public List<Todo> getTodoCompletati() {
		return repo.findAll().stream().filter(t->t.isCompletato()).collect(Collectors.toList());
	}

	@Override
	public List<Todo> getTodoIncompleti() {
		return repo.findByCompletatoFalse();
	}

	@Override
	public List<Todo> getTodoByDescription(String descrizione) {
		return repo.findByDescrizioneContaining(descrizione);
	}

}
