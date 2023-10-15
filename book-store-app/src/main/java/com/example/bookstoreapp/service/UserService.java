package com.example.bookstoreapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.User;


@Service
public interface UserService {
    List<User> getAllUsers();
    User addUser(User user);
    User getUserById(Long user_id);
    User updateUser(Long userid,User user);
    public void deleteUser(Long user_id);
    
}
