package com.example.bookstoreapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.Category;

@Service
public interface CategoryService {

    List<Category> getAllItems();
    Category createItem(Category category);
    Category getItemById(Long categoryId);
    Category updateItem(Long categoryId,Category category);
    public void deleteItem(Long categoryId);


    
}
