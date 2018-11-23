package com.baizhi.service.impl;

import com.baizhi.service.BookService;
import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bd;

    @Override
    public void insert(Book book) {
        bd.insert(book);
    }

    @Override
    public void delete(int id) {
        bd.delete(id);
    }

    @Override
    public void update(Book book) {
        bd.update(book);
    }

    /*@Override
    public Map selectBypage(int page, int rows, String name) {
        int start=(page-1)*rows+1;
        int end=page*rows;
        List<Book> list=bd.selectBypage(start,end,name);

        int count=bd.getCount(name);
        Map map=new HashMap();

        map.put("rows", list);
        map.put("total", count);

        return map;
    }*/

    @Override
    public List<Book> selectAll() {

        return bd.selectAll();
    }

    @Override
    public Book selectOne(int id) {
        return bd.selectOne(id);

    }
}
