package com.example.bookstoreapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Category {

    @Id
    private Long categoryId;
    private String optional_desc;
    private String categoryName;
}
