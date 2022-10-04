package com.coursedesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coursedesign.dao.UserDao;
import com.coursedesign.domain.User;
import com.coursedesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void remove(Long id) {

    }
}
