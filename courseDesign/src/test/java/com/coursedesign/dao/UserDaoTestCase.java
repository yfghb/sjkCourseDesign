package com.coursedesign.dao;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDaoTestCase {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetById(){
        userDao.selectById(1);
    }
}
