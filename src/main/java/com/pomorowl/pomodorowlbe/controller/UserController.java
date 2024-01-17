package com.pomorowl.pomodorowlbe.controller;

import com.pomorowl.pomodorowlbe.entities.User;
import com.pomorowl.pomodorowlbe.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }


    @PutMapping("/{userId}")
    public User updateUserPassword(@PathVariable User user, String newPassword, @PathVariable String userId) {
        return userService.updateUserPassword(user, newPassword);
    }

}
