package com.pomorowl.pomodorowlbe.repos;

import com.pomorowl.pomodorowlbe.entities.Todo;
import com.pomorowl.pomodorowlbe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Long> {

    List<Todo> findTodosByUserId(Long userId);
}
