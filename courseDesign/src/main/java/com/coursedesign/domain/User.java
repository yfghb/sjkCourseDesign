package com.coursedesign.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(type = IdType.AUTO)//对User表设置id自增
    private Integer id;

    private String name;

    private String headImage;

    private String password;

    private String account;

    private String message;
}


