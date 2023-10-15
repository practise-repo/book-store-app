package com.example.bookstoreapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.User;
import com.example.bookstoreapp.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

     @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long user_id) {

        return userRepository.findById(user_id).orElse(null);
    }

    @Override
    public User updateUser(Long user_id, User user) {
        User existUser = userRepository.findById(user_id).orElse(null);
        if (existUser != null) {
            existUser.setUsername(user.getUsername());
            existUser.setPassword(user.getPassword());
            return existUser;

        } else {
            return null;
        }

    }

    @Override
    public void deleteUser(Long user_id) {
        userRepository.deleteById(user_id);
    }
    
}
