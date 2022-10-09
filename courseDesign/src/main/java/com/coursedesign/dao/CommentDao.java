package com.coursedesign.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coursedesign.domain.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CommentDao extends BaseMapper<Comment> {
    @Update("update comment set praise=praise+1 where comment_id = #{id}")
    Boolean updateByCommentId(Integer id);
}
