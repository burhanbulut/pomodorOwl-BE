package com.pomorowl.pomodorowlbe.controller;

import com.pomorowl.pomodorowlbe.entities.Todo;
import com.pomorowl.pomodorowlbe.request.TodoRequest;
import com.pomorowl.pomodorowlbe.services.TodoService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@CrossOrigin
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping()
    public Todo addTodo(@RequestBody TodoRequest todo) {
        return todoService.addTodo(todo);
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.findAllTodos();
    }

    @GetMapping("/userTodos/{userId}")
    public List<Todo> getUserTodos(@PathVariable Long userId){
        return todoService.findUserTodos(userId);
    }

    @GetMapping("/{todoId}")
    public Todo getTodoById(@PathVariable Long todoId) {
        return todoService.findTodoById(todoId);
    }

    @PutMapping("/{todoId}")
    public Todo updateTodoById(@PathVariable Long todoId, @RequestBody TodoRequest todo) {
        return todoService.updateTodoById(todoId, todo);
    }

    @DeleteMapping("/{todoId}")
    public void deleteTodoById(@PathVariable Long todoId) {
        todoService.deleteTodoById(todoId);
    }

}
