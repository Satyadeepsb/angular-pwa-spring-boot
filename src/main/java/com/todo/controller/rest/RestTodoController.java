package com.todo.controller.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.model.Todo;
import com.todo.model.rest.RestTodo;
import com.todo.service.TodoService;

@RestController
public class RestTodoController {

	@Autowired
	private TodoService todoService;

	@GetMapping(value = "get/todos")
	public List<Todo> getTodos(){
		return todoService.getTodoList();
	}
	@GetMapping(value = "get/todo/{id}")
	public Todo getTodo(@PathVariable Long id){
		return todoService.getTodo(id);
	}
	@PostMapping(value = "create/todo")
	public Todo createTodo(@RequestBody RestTodo restTodo){
		return todoService.createTodo(restTodo);
	}
	@PutMapping(value = "update/todo")
	public Todo updateTodo(@RequestBody RestTodo restTodo){
		return todoService.updateTodo(restTodo);
	}
	@DeleteMapping(value = "delete/todo/{id}")
	public Long deleteTodo(@PathVariable Long id){
		return todoService.deleteTodo(id);
	}
}
