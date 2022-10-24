package com.controller;

import com.Result;
import com.pojo.Book;
import com.service.BookServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/books")
@ResponseBody
public class BookController {

    @Autowired
    BookServiceImpl bookService;





    @GetMapping("/{id}")
    public Result getById(@PathVariable int id){
        Book book = bookService.getById(id);
        return book!= null ? Result.success(book):Result.fail(204,book);
    }

    @GetMapping("/all")
    public Result getAll(){
        List<Book> list = bookService.getAll();
        return Result.success(list);
    }

    @PostMapping
    public Result insert(@RequestBody Book book){
        Boolean flag = bookService.insert(book);
        return flag ? Result.success(book):Result.fail(204,book);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        Boolean flag = bookService.deleteById(id);
        return flag;
    }

    @PutMapping("/update")
    public Result update(@RequestBody Book book){
        System.out.println(book);
        Boolean flag = bookService.update(book);
        return flag ? Result.success(book) : Result.fail(202,book);
    }

    @GetMapping("/page/{pageBegin}/{pageSize}")
    public Result getByPage(@PathVariable int pageBegin,@PathVariable int pageSize){
        List<Book> books = bookService.getByPage(pageBegin, pageSize);
        System.out.println(books);
        return books!=null ? Result.success(books):Result.fail(202,books);
//          return books;
    }


}
