package com.mercy.mapper.adcontext;

import com.mercy.model.adcontext.AdUserinfo;
import com.mercy.model.adcontext.AdUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdUserinfoMapper {
    long countByExample(AdUserinfoExample example);

    int deleteByExample(AdUserinfoExample example);

    int insert(AdUserinfo record);

    int insertSelective(AdUserinfo record);

    List<AdUserinfo> selectByExample(AdUserinfoExample example);

    int updateByExampleSelective(@Param("record") AdUserinfo record, @Param("example") AdUserinfoExample example);

    int updateByExample(@Param("record") AdUserinfo record, @Param("example") AdUserinfoExample example);
}