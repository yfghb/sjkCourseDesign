package com.coursedesign.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coursedesign.domain.Essay;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EssayDao extends BaseMapper<Essay> {
}
