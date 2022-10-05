package com.coursedesign.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Comment {

    private Integer essayId;

    @TableId(type = IdType.AUTO)
    private Integer commentId;

    private String headImage;

    private String name;

    private String commentText;

    private Timestamp createTime;

    private Integer praise;
}
