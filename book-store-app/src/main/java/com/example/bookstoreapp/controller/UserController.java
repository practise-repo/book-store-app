package com.example.bookstoreapp.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreapp.entity.User;
import com.example.bookstoreapp.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllusers() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());

    }

    @GetMapping("/user/{user_id}")
    public ResponseEntity<User> getUserById(@PathVariable Long user_id) {

        try {
            User existUser = userService.getUserById(user_id);
            return ResponseEntity.status(HttpStatus.OK).body(existUser);

        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createUser = userService.addUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(createUser);
    }

    @DeleteMapping("/user/{user_id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long user_id) {

        try {

            userService.deleteUser(user_id);
            return ResponseEntity.status(HttpStatus.OK).body(null);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }
    }

}
