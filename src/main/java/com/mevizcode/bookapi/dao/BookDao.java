package com.mevizcode.bookapi.dao;

import com.mevizcode.bookapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

}
