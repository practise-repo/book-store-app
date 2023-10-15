package com.example.bookstoreapp.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreapp.entity.Orders;
import com.example.bookstoreapp.service.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public ResponseEntity<List<Orders>> getAllItems() {

        return ResponseEntity.status(HttpStatus.OK).body(orderService.getAllItems());

    }

    @GetMapping("/order/{order_id}")
    public ResponseEntity<Orders> getBookById(@PathVariable Long order_id) {

        try {
             Orders existItem = orderService.getItemById(order_id);
             return ResponseEntity.status(HttpStatus.OK).body(existItem);
            
        } catch (NoSuchElementException e) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

        
       
    }

    @PostMapping("/order")
    public ResponseEntity<Orders> createItem(@RequestBody Orders order) {
        Orders createItem = orderService.createItem(order);
        return new ResponseEntity<>(createItem, HttpStatus.OK);
    }

    @DeleteMapping("/order/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long order_id) {

        try {
            orderService.deleteItem(order_id);
            return ResponseEntity.status(HttpStatus.OK).body(null);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }
    }

}
