package com.mercy.mapper;

import com.mercy.model.AdUserinfoInterface;
import com.mercy.model.AdUserinfoInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdUserinfoInterfaceMapper {
    long countByExample(AdUserinfoInterfaceExample example);

    int deleteByExample(AdUserinfoInterfaceExample example);

    int insert(AdUserinfoInterface record);

    int insertSelective(AdUserinfoInterface record);

    List<AdUserinfoInterface> selectByExample(AdUserinfoInterfaceExample example);

    int updateByExampleSelective(@Param("record") AdUserinfoInterface record, @Param("example") AdUserinfoInterfaceExample example);

    int updateByExample(@Param("record") AdUserinfoInterface record, @Param("example") AdUserinfoInterfaceExample example);
}