package com.coursedesign.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coursedesign.domain.User;


public interface UserService extends IService<User> {

    public void remove(Long id);

//    IPage<User> getPage(int current, int size);
//    IPage<User> getPage(int current, int size, User user);
}
