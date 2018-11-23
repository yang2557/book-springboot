package com.baizhi.dao;

import com.baizhi.entity.Book;

import java.util.List;

public interface BookDao {

    public void insert(Book book);
    public void delete(int id);
    public void update(Book book);

    /*public List<Book> selectBypage(@Param("start") int start, @Param("end")int end, @Param("name") String name);

    public int getCount(@Param("name")String name);*/

    public  Book selectOne(int id);
    public List<Book> selectAll();


}
