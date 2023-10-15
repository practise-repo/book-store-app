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

import com.example.bookstoreapp.entity.SubCategory;
import com.example.bookstoreapp.service.SubCategoryService;

@RestController
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

  @GetMapping("/subcategory")
    public ResponseEntity<List<SubCategory>> getAllItem() {

        return ResponseEntity.status(HttpStatus.OK).body(subCategoryService.getAllItems());

    }

     @GetMapping("/subcategory/{sub_id}")
    public ResponseEntity<SubCategory> getCategoryById(@PathVariable Long sub_id) {

        try {

            return ResponseEntity.status(HttpStatus.OK).body(subCategoryService.getItemById(sub_id));

        } catch (NoSuchElementException e) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }

    @PostMapping("/subcategory")
    public ResponseEntity<SubCategory> saveItem(@RequestBody SubCategory subCategory) {
       
        try {
             SubCategory createSubCategory = subCategoryService.createItem(subCategory);
             return ResponseEntity.status(HttpStatus.CREATED).body(createSubCategory);
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
           
        }
       

    }

    @DeleteMapping("/subcategory/{sub_id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long sub_id) {

        try {

            subCategoryService.deleteItem(sub_id);
            return ResponseEntity.status(HttpStatus.OK).body(null);

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }



    
}
