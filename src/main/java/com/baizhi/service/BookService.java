package com.baizhi.service;

import com.baizhi.entity.Book;

import java.util.List;

public interface BookService {
    public void insert(Book book);
    public void delete(int id);
    public void update(Book book);
    public List<Book> selectAll();
//    public Map selectBypage(int page, int rows, String name);

    public  Book selectOne(int id);
}
