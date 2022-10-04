package com.coursedesign.domain;


import lombok.Data;

import java.sql.Timestamp;

@Data
public class Comment {

    private Integer essay_id;
    private Integer comment_id;
    private String head_image;
    private String name;
    private String comment_text;
    private Timestamp create_time;
    private Integer praise;
}
