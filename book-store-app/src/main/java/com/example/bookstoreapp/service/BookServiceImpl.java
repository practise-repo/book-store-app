package com.example.bookstoreapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoreapp.entity.Book;
import com.example.bookstoreapp.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllItems() {
        return bookRepository.findAll();
    }

    @Override
    public Book createItem(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getItemById(Long isbn) {
        return bookRepository.findById(isbn).orElse(null);
    }

    @Override
    public Book updateItem(Long isbn, Book book) {

        Book existItem = bookRepository.findById(isbn).orElseThrow(null);
        if (existItem != null) {
            existItem.setAuthor(book.getAuthor());
            existItem.setTitle(book.getTitle());
            existItem.setUnit_price(book.getUnit_price());
            existItem.setQty(book.getQty());

            return existItem;

        } else {
            return null;
        }

    }

    @Override
    public void deleteItem(Long isbn) {
        bookRepository.deleteById(isbn);
    }

}
