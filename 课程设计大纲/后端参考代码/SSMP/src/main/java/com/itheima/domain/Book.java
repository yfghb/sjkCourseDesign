package com.itheima.domain;

import lombok.Data; // 一个帮我写getter，setter等等方法的包

@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
    //与数据库的表中的数据名一一对应

}
