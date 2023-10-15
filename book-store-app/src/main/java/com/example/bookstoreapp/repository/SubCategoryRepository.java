package com.example.bookstoreapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstoreapp.entity.SubCategory;


@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory,Long>{
    
}
