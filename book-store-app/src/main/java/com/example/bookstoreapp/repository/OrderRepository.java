package com.example.bookstoreapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstoreapp.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders,Long> {
    
}
