package com.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {

	@Id
	@SequenceGenerator(name="todo_pkey",sequenceName="todo_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="todo_pkey")
	private Long id;
	private String toDoName;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToDoName() {
		return toDoName;
	}

	public void setToDoName(String toDoName) {
		this.toDoName = toDoName;
	}

	

}
