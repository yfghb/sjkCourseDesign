package com.coursedesign.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coursedesign.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserDao extends BaseMapper<User> {
    @Select("select * from user where account=#{account}")
    User selectByAccount(String account);
}
