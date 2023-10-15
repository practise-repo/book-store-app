package com.example.bookstoreapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.Orders;
import com.example.bookstoreapp.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Orders> getAllItems() {
        return orderRepository.findAll();
    }

    @Override
    public Orders createItem(Orders order) {
        return orderRepository.save(order);
    }

    @Override
    public Orders getItemById(Long order_id) {

        return orderRepository.findById(order_id).orElse(null);
    }

    @Override
    public Orders updateItem(Long order_id, Orders order) {
        Orders existOrder = orderRepository.findById(order_id).orElse(null);
        if (existOrder != null) {
            existOrder.setOrder_date(order.getOrder_date());
            existOrder.setQty(order.getQty());
            existOrder.setUnit_price(order.getUnit_price());
            existOrder.setBook_name(order.getBook_name());
            existOrder.setUser_id(order.getUser_id());
            return existOrder;

        } else {
            return null;
        }

    }

    @Override
    public void deleteItem(Long order_id) {
        orderRepository.deleteById(order_id);
    }

}
