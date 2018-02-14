package com.mercy.mapper.queue;

import com.mercy.model.queue.QueueUserinfo;
import com.mercy.model.queue.QueueUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueueUserinfoMapper {
    long countByExample(QueueUserinfoExample example);

    int deleteByExample(QueueUserinfoExample example);

    int insert(QueueUserinfo record);

    int insertSelective(QueueUserinfo record);

    List<QueueUserinfo> selectByExample(QueueUserinfoExample example);

    int updateByExampleSelective(@Param("record") QueueUserinfo record, @Param("example") QueueUserinfoExample example);

    int updateByExample(@Param("record") QueueUserinfo record, @Param("example") QueueUserinfoExample example);
}