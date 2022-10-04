package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.R;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {return new R(true, bookService.list());}
    @PostMapping
    public R save(@RequestBody Book book) {
        return new R(bookService.save(book));
    }
    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.updateById(book));
    }
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.removeById(id));
    }
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, bookService.getById(id));
    }
    @GetMapping("{current}/{size}")
    public R getPage(@PathVariable int current,@PathVariable int size,Book book) {
        //如果当前页码值大于总页码值,那么以总页码值作为当前页码值的查询结果
        IPage<Book> page = bookService.getPage(current,size,book);
        if(current > page.getPages()){
            page = bookService.getPage((int)page.getPages(),size,book);
        }
        return new R(true, page);
    }
}
