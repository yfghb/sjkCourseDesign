package com.coursedesign.domain;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Essay {

    private Integer id;

    @TableId(type = IdType.AUTO)
    private Integer essayId;

    private Integer checkId;

    private String title;

    private String article;

    private Timestamp createTime;

    private Integer praise;

    private String img;

    private boolean isVisible;

    private boolean isChecked;
}


