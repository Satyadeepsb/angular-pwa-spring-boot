package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.model.Todo;

public interface TodoJpaRepository extends JpaRepository<Todo, Long>{

}
