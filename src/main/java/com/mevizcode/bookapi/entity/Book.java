package com.mevizcode.bookapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String author;

   public Book(){}
    public Book(Integer id, String name, String author){
       this.id = id;
       this.name = name;
       this.author = author;
    }
    
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void setId(Integer id){
       this.id = id;
    }
    public Integer getId(){
       return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
}
