package com.pomorowl.pomodorowlbe.services;

import com.pomorowl.pomodorowlbe.entities.Todo;
import com.pomorowl.pomodorowlbe.entities.User;
import com.pomorowl.pomodorowlbe.repos.UserRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }


    public User updateUserPassword(User user, String newPassword) {
        Optional<User> userOptional = userRepository.findById(user.getId());
        if (userOptional.isPresent()) {
            User userFromDb = userOptional.get();
            userFromDb.setPassword(newPassword);
            return userRepository.save(userFromDb);
        }
        return null;
    }


    public User getOneUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    public User getOneUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
