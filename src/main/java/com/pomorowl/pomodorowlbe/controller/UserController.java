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
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getOneUserById(userId);
    }

//
//    @PutMapping("/{userId}")
//    public User updateUserPassword(@PathVariable User user,  @PathVariable String userId) {
//        return userService.updateUserPassword(user);
//    }

}
