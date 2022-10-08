package com.coursedesign.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coursedesign.controller.utils.R;
import com.coursedesign.domain.Essay;
import com.coursedesign.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/essay")
public class EssayController {

    @Autowired
    private EssayService essayService;

    /**
     * 新增文章
     * @param essay 传入一个Essay实体
     * @return boolean
     */
    @PostMapping("/save")
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
    public R getLikeName(int page,int pageSize,String name,Integer id) {
        Page pageInfo = new Page<>(page,pageSize);
        LambdaQueryWrapper<Essay> lqw = new LambdaQueryWrapper<>();
        if(Objects.equals(name, "check")){
            lqw.eq(Essay::getCheckId, id);
            lqw.eq(Essay::getIsChecked,false);
        }else{
            lqw.eq(Essay::getIsVisible,true);
            lqw.like(name!=null,Essay::getTitle,name);
        }
        lqw.orderByAsc(Essay::getCreateTime);
        essayService.page(pageInfo,lqw);
        return new R(true,pageInfo);
    }

    /**
     * 以id获取文章内容
     * @param id 传入一个int值id
     * @return R(Essay)实体
     */
    @GetMapping("/get")
    public R getOne(Integer id){
        return new R(true,essayService.getById(id));
    }

    /**
     * 修改文章
     * @param essay 传入一个Essay实体
     * @return boolean
     */
    @PutMapping("/update")
    public R update(@RequestBody Essay essay){
        return new R(true,essayService.updateById(essay));
    }

    /**
     * 以id批量修改文章可见性
     * @param id 传入一个int值id
     * @return boolean
     */
    @PutMapping("/update/id")
    public R updateById(Integer id){
        return new R(essayService.updateStatus(id));
    }
}
