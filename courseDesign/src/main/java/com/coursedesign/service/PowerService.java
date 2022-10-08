package com.coursedesign.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coursedesign.domain.Power;

public interface PowerService extends IService<Power> {
    Boolean updateStatusByAct(String account);
}
