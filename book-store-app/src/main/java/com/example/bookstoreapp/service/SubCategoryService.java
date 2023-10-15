package com.example.bookstoreapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.SubCategory;


@Service
public interface SubCategoryService {

    List<SubCategory> getAllItems();

    SubCategory createItem(SubCategory subCategory);

    SubCategory getItemById(Long sub_id);

    SubCategory updateItem(Long sub_id, SubCategory subCategory);

    public void deleteItem(Long sub_id);

}
