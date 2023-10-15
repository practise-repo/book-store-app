package com.example.bookstoreapp.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.Book;

@Service
public interface BookService {

    List<Book> getAllItems();
    Book createItem(Book book);
    Book getItemById(Long isbn);
    Book updateItem(Long isbn,Book book);
    public void deleteItem(Long isbn);
    
    
}
