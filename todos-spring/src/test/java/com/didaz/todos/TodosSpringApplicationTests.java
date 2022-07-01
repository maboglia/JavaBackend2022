package com.didaz.todos;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.didaz.todos.entities.Todo;
import com.didaz.todos.services.TodoService;

@SpringBootTest
class TodosSpringApplicationTests {
	
	@Autowired
	private TodoService service;
	@Test
	void contextLoads() {
		
		String[] cose = {"pane","pasta","caffe","latte","cioccolato e nutella"};
		for (String cosa : cose) {
			
			Todo t = new Todo();
			t.setDescrizione(cosa);
			t.setData(LocalDate.now());
			t.setCompletato(false);
			service.addTodo(t);
		}
		
		
	}

}
