package com.itheima.service;

import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private IBookService ibookService;

    @Test
    void testGetById(){
        System.out.println("----------------------------------------------\n");
        System.out.println(ibookService.getById(4));
        System.out.println("\n--------------------------------");
    }

    @Test
    public void insert(){
        Book b = new Book();

        b.setName("测试添加，不设置id");

        if(ibookService.save(b)){
            System.out.println("ok!");
        }
    }
}
