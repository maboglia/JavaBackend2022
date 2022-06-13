package main;

import java.util.List;

import controller.TodoCtrl;
import model.Todo;

public class App {

	public static void main(String[] args) {


		TodoCtrl ctrl = new TodoCtrl();
		
		ctrl.addTodo("latte");
		ctrl.addTodo("pane");
		ctrl.addTodo("vino");
		Todo t = new Todo("pomodoro");
		ctrl.addTodo(t);

		List<Todo> lista = ctrl.getLista();
		
		ctrl.completa(2);
		
		for (Todo todo : lista) {
			System.out.println(todo);
		}
		
	}

}
