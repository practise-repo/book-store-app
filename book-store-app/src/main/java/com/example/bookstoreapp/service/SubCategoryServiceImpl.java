package com.example.bookstoreapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.SubCategory;
import com.example.bookstoreapp.repository.SubCategoryRepository;


@Service
public class SubCategoryServiceImpl implements SubCategoryService{

    @Autowired
    private SubCategoryRepository subCategoryRepository;

     @Override
    public List<SubCategory> getAllItems() {
        return subCategoryRepository.findAll();
    }

    @Override
    public SubCategory createItem(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }

    @Override
    public SubCategory getItemById(Long sub_id) {
        return  subCategoryRepository.findById(sub_id).orElse(null);
    }

    @Override
    public SubCategory updateItem(Long sub_id, SubCategory subCategory) {
        SubCategory existCategory = subCategoryRepository.findById(sub_id).orElseThrow();

        if(existCategory!=null){
            existCategory.setSub_id(subCategory.getSub_id());
            existCategory.setSubCategoryName(subCategory.getSubCategoryName());
            existCategory.setOpionDesc(subCategory.getOpionDesc());
            return existCategory;

        }else{
            return null;
        }
    }

    @Override
    public void deleteItem(Long sub_id) {
        subCategoryRepository.deleteById(sub_id);
    }
    
}
