package com.example.bookstoreapp.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;
    @Column(nullable = false)
    private Date order_date;
    @Column(nullable = false)
    private int qty;
    @Column(nullable = false)
    private String book_name;
    @Column(nullable = false)
    private double unit_price;
    @Column(nullable = false)
    private double total;


    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user_id;

    @ManyToMany
    @JoinTable(
        name="order_books",
        joinColumns = {@JoinColumn(name="order_id")},
        inverseJoinColumns = {@JoinColumn(name="isbn")}
    )
    private Set<Book> books=new HashSet<>();

    
}
