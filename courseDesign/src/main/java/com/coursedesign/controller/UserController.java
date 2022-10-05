package com.coursedesign.controller;

import com.coursedesign.controller.utils.R;
import com.coursedesign.domain.User;
import com.coursedesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 新增用户
     * @param user 传入一个User实体
     * @return boolean
     */
    @PostMapping
    public R save(@RequestBody User user) {
        return new R(userService.save(user));
    }

    /**
     * 修改用户信息
     * @param user 传入一个User实体
     * @return boolean
     */
    @PutMapping
    public R update(@RequestBody User user) {
        return new R(true,userService.updateById(user));
    }

    /**
     * 以id删除用户
     * @param id 传入一个int类型值id
     * @return boolean
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable int id) {
        return new R(userService.removeById(id));
    }

    /**
     * 以id查询用户
     * @param id 传入一个int类型值id
     * @return User类型实体
     */
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true,userService.getById(id));
    }



}
