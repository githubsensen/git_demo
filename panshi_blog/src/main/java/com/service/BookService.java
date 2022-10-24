package com.service;

import com.pojo.Book;

import java.util.List;

public interface BookService {
    Book getById(Integer id);
     List<Book> getAll();
    Boolean deleteById(int id);
    Boolean update(Book book);
    Boolean insert(Book book);
    List<Book> getByPage(int pageBegin, int pageSize);
}
