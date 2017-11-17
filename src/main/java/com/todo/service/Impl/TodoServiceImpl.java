package com.todo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.model.Todo;
import com.todo.model.rest.RestTodo;
import com.todo.repository.TodoJpaRepository;
import com.todo.service.TodoService;

@Service
public class TodoServiceImpl  implements  TodoService{

	@Autowired
	private TodoJpaRepository todoJpaRepository;
	
	@Override
	public List<Todo> getTodoList(){
		 return todoJpaRepository.findAll();
	}
	
	@Override
	public Todo getTodo(Long id){
		 return todoJpaRepository.findOne(id);
	}
	@Override
	public Todo createTodo(RestTodo restTodo){
		Todo todo = new Todo();
		todo.setToDoName(restTodo.getToDoName());
		return todoJpaRepository.save(todo);
	}
	
	@Override
	public Todo updateTodo(RestTodo restTodo){
		Todo todo = todoJpaRepository.findOne(restTodo.getId());
		todo.setToDoName(restTodo.getToDoName());
		return todoJpaRepository.save(todo);
	}
	@Override
	public Long deleteTodo(Long id){
		Todo todo = todoJpaRepository.findOne(id);
		todoJpaRepository.delete(todo);
		return id;
	}
	
	
	
}
