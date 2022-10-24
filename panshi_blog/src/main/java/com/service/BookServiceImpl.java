package com.service;

import com.dao.BookDao;
import com.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;
    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Boolean deleteById(int id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public Boolean insert(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public List<Book> getByPage(int pageBegin, int pageSize) {
        return bookDao.getByPage(pageBegin,pageSize);
    }

}
