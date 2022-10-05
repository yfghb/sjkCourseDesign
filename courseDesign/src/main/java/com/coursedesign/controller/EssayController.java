package com.coursedesign.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coursedesign.controller.utils.R;
import com.coursedesign.domain.Essay;
import com.coursedesign.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/essays")
public class EssayController {

    @Autowired
    private EssayService essayService;

    /**
     * 新增文章
     * @param essay 传入一个Essay实体
     * @return boolean
     */
    @PostMapping("/create")
    public R save(@RequestBody Essay essay) {
        return new R(essayService.save(essay));
    }

    /**
     * 以id删除文章
     * @param id 传入一个int值id
     * @return boolean
     */
    @DeleteMapping("/delete")
    public R delete(Integer id) {
        return new R(essayService.removeById(id));
    }

    /**
     * 文章分页
     * @param page 一页显示page条数据
     * @param pageSize 总共pageSize页
     * @param name String值name，用于模糊查询
     * @return 文章列表
     */
    @GetMapping("/page")
    public R getLikeName(int page,int pageSize,String name) {
        Page pageInfo = new Page<>(page,pageSize);
        LambdaQueryWrapper<Essay> lqw = new LambdaQueryWrapper<>();
        lqw.like(name!=null,Essay::getTitle,name);
        lqw.orderByAsc(Essay::getCreate_time);
        essayService.page(pageInfo,lqw);
        return new R(true,pageInfo);
    }
}
