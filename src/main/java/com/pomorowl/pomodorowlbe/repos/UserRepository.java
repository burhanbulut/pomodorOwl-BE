package com.pomorowl.pomodorowlbe.repos;
import com.pomorowl.pomodorowlbe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String userName);
}
