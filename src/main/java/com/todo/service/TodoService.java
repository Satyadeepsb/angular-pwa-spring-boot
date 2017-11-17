package com.todo.service;

import java.util.List;

import com.todo.model.Todo;
import com.todo.model.rest.RestTodo;

public interface TodoService {

	List<Todo> getTodoList();

	Todo createTodo(RestTodo restTodo);

	Todo updateTodo(RestTodo restTodo);

	Todo getTodo(Long id);
	
	Long deleteTodo(Long id);

}
