package com.arthur.spring_crud.controller;

import com.arthur.spring_crud.entity.User;
import com.arthur.spring_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<String> addUser(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("User added successfully");
    }

    @GetMapping
    public ResponseEntity<?> getUsers(@RequestParam(value = "id", required = false) Integer id) {
        if (id == null) {
            // Retorna todos os usuários
            List<User> users = userService.getUsers();
            return ResponseEntity.ok(users);
        } else {
            // Retorna um usuário específico
            User user = userService.getUser(id);
            return ResponseEntity.ok(user);
        }
    }


}
