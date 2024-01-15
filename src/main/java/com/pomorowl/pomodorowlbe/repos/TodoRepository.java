package com.pomorowl.pomodorowlbe.repos;

import com.pomorowl.pomodorowlbe.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
