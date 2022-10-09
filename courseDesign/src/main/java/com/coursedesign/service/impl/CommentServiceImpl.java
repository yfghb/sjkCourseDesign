package com.coursedesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coursedesign.dao.CommentDao;
import com.coursedesign.domain.Comment;
import com.coursedesign.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public Boolean updateById(Integer id) {
        return commentDao.updateByCommentId(id);
    }
}
