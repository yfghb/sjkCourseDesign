package com.coursedesign.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coursedesign.controller.utils.R;
import com.coursedesign.domain.Comment;
import com.coursedesign.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentConroller {

    @Autowired
    private CommentService commentService;

    /**
     * 新增评论
     * @param comment 传入一个Comment实体
     * @return boolean
     */
    @PostMapping
    public R save(@RequestBody Comment comment) {
        return new R(commentService.save(comment));
    }

    /**
     * 以id删除评论
     * @param id 传入一个int类型值id
     * @return boolean
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Integer id) {
        return new R(commentService.removeById(id));
    }

    /**
     * 评论分页
     * @param page 一页显示page条数据
     * @param pageSize 总共pageSize页
     * @return 评论列表
     */
    @GetMapping("/page")
    public R page(int page,int pageSize){
        Page pageInfo = new Page<>(page,pageSize);
        LambdaQueryWrapper<Comment> lqw = new LambdaQueryWrapper<>();
        lqw.orderByAsc(Comment::getCreate_time);
        commentService.page(pageInfo,lqw);
        return new R(true,pageInfo);
    }
}
