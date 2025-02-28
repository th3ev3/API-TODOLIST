package br.com.th3ev3.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.th3ev3.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
