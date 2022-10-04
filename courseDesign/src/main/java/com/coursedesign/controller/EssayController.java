package com.coursedesign.controller;


import com.coursedesign.common.R;
import com.coursedesign.domain.Essay;
import com.coursedesign.domain.User;
import com.coursedesign.service.EssayService;
import com.coursedesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/essays")
public class EssayController {

    @Autowired
    private EssayService essayService;

    @PostMapping
    public R<String> save(@RequestBody Essay essay) {
        essayService.save(essay);
        return R.success("新增文章成功！");
    }
    @PutMapping
    public R<String> update(@RequestBody Essay essay) {
        essayService.updateById(essay);
        return R.success("修改文章信息成功！");
    }
    @DeleteMapping
    public R<String> delete(Long ids) {
        essayService.removeById(ids);
        return R.success("文章信息删除成功!");
    }
    @GetMapping("{id}")
    public R<String> getById(@PathVariable Integer id) {
        essayService.getById(id);
        return R.success("该用户信息");
    }
}
