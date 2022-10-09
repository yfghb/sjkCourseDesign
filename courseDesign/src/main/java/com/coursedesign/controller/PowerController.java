package com.coursedesign.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.coursedesign.controller.utils.R;
import com.coursedesign.domain.Power;
import com.coursedesign.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/power")
public class PowerController {

    @Autowired
    private PowerService powerService;


    /**
     * 更新power
     * @param account 传入一个String值account
     * @return boolean
     */
    @PutMapping("/account")
    public R update(String account){
        return new R(powerService.updateStatusByAct(account));
    }

    /**
     * 新增数据
     * @param power 传入一个power实体
     * @return boolean
     */
    @PostMapping
    public R save(@RequestBody Power power){
        return new R(powerService.save(power));
    }

    /**
     * 以账号查询power表
     * @param account 传入一个String值power
     * @return Power实体
     */
    @GetMapping("/account")
    public R getByAccount(String account){
        LambdaQueryWrapper<Power> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Power::getAccount,account);
        return new R(true,powerService.getOne(lqw));
    }
}
