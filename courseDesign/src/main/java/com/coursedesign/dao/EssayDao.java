package com.coursedesign.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coursedesign.domain.Essay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EssayDao extends BaseMapper<Essay> {
    @Update("update essay set is_visible=false, is_checked = true where id = #{id}")
    Boolean updateStatus(Integer id);
}
