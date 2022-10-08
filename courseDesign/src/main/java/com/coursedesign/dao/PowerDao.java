package com.coursedesign.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coursedesign.domain.Power;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PowerDao extends BaseMapper<Power> {
    @Update("update power set is_disabled = true where account=#{account}")
    Boolean updateStatusByAccount(String account);

}
