package com.coursedesign.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coursedesign.dao.EssayDao;
import com.coursedesign.domain.Essay;
import com.coursedesign.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EssayServiceImpl extends ServiceImpl<EssayDao, Essay> implements EssayService {

    @Autowired
    private EssayDao essayDao;
}
