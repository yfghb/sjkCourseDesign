package com.coursedesign.controller;

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
}
