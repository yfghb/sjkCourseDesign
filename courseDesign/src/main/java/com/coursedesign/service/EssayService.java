package com.coursedesign.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coursedesign.domain.Essay;

public interface EssayService extends IService<Essay> {
    Boolean updateStatus(Integer id);
}
