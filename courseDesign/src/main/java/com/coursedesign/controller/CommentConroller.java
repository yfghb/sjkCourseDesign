package com.coursedesign.controller;

import com.coursedesign.common.R;
import com.coursedesign.domain.Comment;
import com.coursedesign.domain.Essay;
import com.coursedesign.service.CommentService;
import com.coursedesign.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentConroller {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public R<String> save(@RequestBody Comment comment) {
        commentService.save(comment);
        return R.success("新增评论成功！");
    }
    @PutMapping
    public R<String> update(@RequestBody Comment comment) {
        commentService.updateById(comment);
        return R.success("修改评论信息成功！");
    }
    @DeleteMapping
    public R<String> delete(Long ids) {
        commentService.removeById(ids);
        return R.success("文章评论删除成功!");
    }
    @GetMapping("{id}")
    public R<String> getById(@PathVariable Integer id) {
        commentService.getById(id);
        return R.success("该评论信息");
    }
}
