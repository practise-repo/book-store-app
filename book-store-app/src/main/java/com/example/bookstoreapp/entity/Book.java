package com.example.bookstoreapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity
public class Book {


    @Id
    private Long isbn;

    @Column(nullable = false)
    private String title;
    private int qty;
    @Column(nullable = false)
    private String author;
    private double unit_price;
    private Long catg_id;

    @ManyToOne
    @JoinColumn(name="categoryID_FK",nullable = false)
    private Category categoryID;



    
}
