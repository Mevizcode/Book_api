package com.mevizcode.bookapi.service;

import com.mevizcode.bookapi.dao.BookDao;
import com.mevizcode.bookapi.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class BookService {

    @Autowired
    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Collection<Book> getAllBooks(){
        return bookDao.findAll();
    }

    public Book getBookById(int id){
        return bookDao.findById(id).get();
    }

    public void insertBook(Book book){
        Book book1 = new Book(book.getId(), book.getName(), book.getAuthor());
        bookDao.save(book1);
    }

    public void updateBook(Book book){
        Book book1 = new Book(book.getName(),book.getAuthor());
        bookDao.save(book1);
    }

    public void deleteBook(Book book){
         bookDao.delete(book);
    }

}
