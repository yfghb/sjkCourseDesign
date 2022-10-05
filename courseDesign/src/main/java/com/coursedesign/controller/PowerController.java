package com.coursedesign.controller;

import com.coursedesign.controller.utils.R;
import com.coursedesign.domain.Power;
import com.coursedesign.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/powers")
public class PowerController {

    @Autowired
    private PowerService powerService;

    /**
     * 以id查询
     * @param id 传入一个int值id
     * @return Power实体
     */
    @GetMapping
    public R getById(Integer id){
        return new R(true,powerService.getById(id));
    }

    /**
     * 更新power
     * @param power 传入一个Power实体
     * @return boolean
     */
    @PutMapping
    public R update(@RequestBody Power power){
        return new R(powerService.updateById(power));
    }

}
