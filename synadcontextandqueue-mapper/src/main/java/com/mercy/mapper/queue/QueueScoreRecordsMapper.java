package com.mercy.mapper.queue;

import com.mercy.model.queue.QueueScoreRecords;
import com.mercy.model.queue.QueueScoreRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueueScoreRecordsMapper {
    long countByExample(QueueScoreRecordsExample example);

    int deleteByExample(QueueScoreRecordsExample example);

    int insert(QueueScoreRecords record);

    int insertSelective(QueueScoreRecords record);

    List<QueueScoreRecords> selectByExample(QueueScoreRecordsExample example);

    int updateByExampleSelective(@Param("record") QueueScoreRecords record, @Param("example") QueueScoreRecordsExample example);

    int updateByExample(@Param("record") QueueScoreRecords record, @Param("example") QueueScoreRecordsExample example);
}