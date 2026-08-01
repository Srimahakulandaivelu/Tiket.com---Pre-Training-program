package com.todo.service;

import com.todo.model.Todo;
import com.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService{

    @Autowired
    private TodoRepository repo;

    public List<Todo> getAllTodos(){
        return repo.findAll();
    }

    public Todo addTodo(Todo todo){
        return repo.save(todo);
    }

    public Todo toggleCompleted(String id){
        Optional<Todo> optionalTodo = repo.findById(id);

        if(optionalTodo.isPresent()){
            Todo todo = optionalTodo.get();
            todo.setCompleted(!todo.isCompleted());
            return repo.save(todo);
        }

        return null;
    }

    public boolean deleteTodo(String id){
        if(repo.existsById(id)){
            repo.deleteByid(id);
            return true;
        }

        return false;
    }

    public Todo getTodoById(String id){
        return repo.findById(id).orElse(null);
    }
}

