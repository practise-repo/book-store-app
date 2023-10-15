package com.example.bookstoreapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.Category;
import com.example.bookstoreapp.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllItems() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createItem(Category category) {
       return categoryRepository.save(category);
    }

    @Override
    public Category getItemById(Long categoryId) {
        return  categoryRepository.findById(categoryId).orElse(null);
    }

    @Override
    public Category updateItem(Long categoryId, Category category) {
        Category existCategory = categoryRepository.findById(categoryId).orElseThrow();

        if(existCategory!=null){
            existCategory.setCategoryId(category.getCategoryId());
            existCategory.setCategoryName(category.getCategoryName());
            existCategory.setOptional_desc(category.getOptional_desc());
            return existCategory;

        }else{
            return null;
        }
    }

    @Override
    public void deleteItem(Long categoryId) {
       
       categoryRepository.deleteById(categoryId);
    }
    
}
