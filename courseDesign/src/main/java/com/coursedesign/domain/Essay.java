package com.coursedesign.domain;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class Essay {

    private Integer id;
    private Integer essay_id;
    private Integer check_id;
    private String title;
    private String article;
    private Timestamp create_time;
    private Integer praise;
    private boolean is_visible;
    private boolean is_checked;
}


