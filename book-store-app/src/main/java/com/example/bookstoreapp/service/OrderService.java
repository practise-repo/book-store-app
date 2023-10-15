package com.example.bookstoreapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.Orders;


@Service
public interface OrderService {

    List<Orders> getAllItems();
    Orders createItem(Orders order);
    Orders getItemById(Long order_id);
    Orders updateItem(Long order_id,Orders order);
    public void deleteItem(Long order_id);

}
