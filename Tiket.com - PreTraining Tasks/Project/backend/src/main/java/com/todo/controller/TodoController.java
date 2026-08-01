package com.todo.controller;

import com.todo.model.Todo;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tools")
@CrossOrigin(origins = "*")

public class TodoController{
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo toggleTodo(@PathVariable String id){
        return todoService.toggleCompleted(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@pathVariable String id){
        boolean deleted = todoService.deleteTodo(id);

        if(deleted){
            return "Todo deleted successfully";
        }

        return "Todo not found";
    }
}
