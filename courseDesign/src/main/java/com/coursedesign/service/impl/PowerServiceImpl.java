package com.coursedesign.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coursedesign.dao.PowerDao;
import com.coursedesign.dao.UserDao;
import com.coursedesign.domain.Power;
import com.coursedesign.domain.User;
import com.coursedesign.service.PowerService;
import com.coursedesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerServiceImpl extends ServiceImpl<PowerDao, Power> implements PowerService {

    @Autowired
    private PowerDao powerDao;
}
