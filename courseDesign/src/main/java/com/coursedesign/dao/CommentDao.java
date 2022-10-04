package com.coursedesign.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coursedesign.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDao extends BaseMapper<Comment> {
}
