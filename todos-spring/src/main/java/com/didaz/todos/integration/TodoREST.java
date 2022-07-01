package com.didaz.todos.integration;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.didaz.todos.entities.Todo;
import com.didaz.todos.services.TodoService;

@RestController
@RequestMapping("api")
public class TodoREST {
	
	@Autowired
	private TodoService service;

	
	@GetMapping
	public List<Todo> getAll(){
		
		return service.getTodos();
	}
	@GetMapping("completati")
	public List<Todo> getCompletati(){
		
		return service.getTodoCompletati();
	}
	@GetMapping("nonCompletati")
	public List<Todo> getNonCompletati(){
		
		return service.getTodoIncompleti();
	}
	
	@GetMapping("contiene/{descrizione}")
	public List<Todo> getTodoByDescrizione(@PathVariable String descrizione){
		
		return service.getTodoByDescription(descrizione);
	}
	
	@PostMapping
	public Todo addTodo(@RequestBody Todo t) {
		return service.addTodo(t);
	}
	@PutMapping
	public Todo updateTodo(@RequestBody Todo t) {
		return service.updateTodo(t);
	}
	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable int id) {
		service.deleteTodo(id);
		
	}
	
	
}
