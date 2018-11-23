package com.baizhi.controller;

import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class BookController {
    @Autowired
    private BookService bs;

    @RequestMapping("/insert")
    public String insert(Book book){
        bs.insert(book);
        return "redirect:selectAll.abc";
    }
    @RequestMapping("/delete")
    public String delete(int id){

        bs.delete(id);
        return "redirect:selectAll.abc";
    }
    @RequestMapping("/selectOne")
    public String selectOne(Map map, int id){
        map.put("book", bs.selectOne(id));
        return "forward:update.jsp";
    }
    @RequestMapping("/update")
    public String update(Book book){
        bs.update(book);
        return "redirect:selectAll.abc";
    }
    @RequestMapping("selectAll")
    public String selectAll(Map map,Integer page){
        if(page==null){
            page=1;
        }
        // 开启分页功能
        PageHelper.startPage(page,5);
        List<Book> bookList=bs.selectAll();

        PageInfo<Book> pageInfo = new PageInfo<>(bookList);
        map.put("PageInfo",pageInfo);
        map.put("bookList",bookList);
        return "showAll";
      /*List<Book> bookList=bs.selectAll();
      map.put("bookList",bookList);
      return "showAll";*/
    }
}
