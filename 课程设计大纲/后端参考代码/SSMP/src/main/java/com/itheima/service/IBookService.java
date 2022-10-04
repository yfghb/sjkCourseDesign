package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

public interface IBookService extends IService<Book> {
//在MP中利用国人写好的业务层开发
    IPage<Book> getPage(int current,int size);
    IPage<Book> getPage(int current,int size,Book book);
}
