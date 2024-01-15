package com.pomorowl.pomodorowlbe.services;

import com.pomorowl.pomodorowlbe.entities.Todo;
import com.pomorowl.pomodorowlbe.repos.TodoRepository;
import com.pomorowl.pomodorowlbe.request.TodoRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }


    public List<Todo> findAllTodos() {
        return todoRepository.findAll();
    }


    public Todo findTodoById(Long todoId) {
        Optional<Todo> todo = todoRepository.findById(todoId);
        if (todo.isPresent()) {
            return todo.get();
        }else
            return null;

    }

    public Todo updateTodoById(Long todoId, TodoRequest todo) {
        Optional<Todo> todoOptional = todoRepository.findById(todoId);
        if (todoOptional.isPresent()) {
           Todo todo1 = todoOptional.get();
              todo1.setText(todo.getText());
                return todoRepository.save(todo1);

        }else
            return null;
    }

    public void deleteTodoById(Long todoId) {
        todoRepository.deleteById(todoId);
    }
}
