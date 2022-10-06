package com.coursedesign.service;

import com.coursedesign.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getByAccount(){
        System.out.println(userService.getByAccount("administer"));
    }

    @Test
    public void createUser(){
        User u = new User();
        u.setAccount("test");
        u.setPassword("123456");

        if(userService.save(u)){
            System.out.println("yes!");
        }
    }
}
