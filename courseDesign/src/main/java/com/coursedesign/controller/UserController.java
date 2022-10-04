package com.coursedesign.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coursedesign.common.R;
import com.coursedesign.domain.User;
import com.coursedesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.lang.reflect.Type;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/page")
    public R<Page> page(int page, int pageSize){

        //分页构造器
        Page pageInfo = new Page<>(page,pageSize);

        //条件构造器
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        //lqw.orderByDesc(User::getSort);
        //执行查询
        userService.page(pageInfo,lqw);

        return R.success(pageInfo);
    }
    @PostMapping
    public R<String> save(@RequestBody User user) {
        userService.save(user);
        return R.success("新增用户成功！");
    }
    @PutMapping
    public R<String> update(@RequestBody User user) {
        userService.updateById(user);
        return R.success("修改用户信息成功！");
    }
    @DeleteMapping
    public R<String> delete(Long ids) {
        userService.removeById(ids);
        return R.success("用户信息删除成功!");
    }
    @GetMapping("{id}")
    public R<String> getById(@PathVariable Integer id) {
        userService.getById(id);
        return R.success("该用户信息");
    }


//    @GetMapping("{current}/{size}")
//    public R getPage(@PathVariable int current,@PathVariable int size,User user) {
//        //如果当前页码值大于总页码值,那么以总页码值作为当前页码值的查询结果
//        IPage<User> page = userService.getPage(current,size,user);
//        if(current > page.getPages()){
//            page = userService.getPage((int)page.getPages(),size,user);
//        }
//        return new R(true, page);
//  }
}
