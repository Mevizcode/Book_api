package com.mevizcode.bookapi.resources;

import com.mevizcode.bookapi.entity.Book;
import com.mevizcode.bookapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class bookResources {

    @Autowired
    private final BookService bookService;

    public bookResources(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Book> getAllBooks(){
        return bookService.getAllBooks().stream().toList();
    }

    @GetMapping( path = "/{id}")
    public Book getBookById(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    @PostMapping(path = "/create")
    public String createBook(@RequestBody Book book){
        bookService.insertBook(book);
        System.out.println("new book added");
        return "nw book added";
    }

    @PutMapping(path = "/{id}")
    public String updateBook(@PathVariable("id") int id, Book book){
        book.setId(id);
        System.out.println("book updated");
        bookService.updateBook(book);
        return "updated";
    }

    @DeleteMapping(path = "/{id}")
    public String deleteBookById(@PathVariable("id") int id, Book book){
        System.out.println("book deleted");
        book.setId(id);
        bookService.deleteBook(book);
        return "deleted";

    }

}
