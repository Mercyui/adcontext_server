package com.mercy.mapper.queue;

import com.mercy.model.queue.QueueScoreRecords;
import com.mercy.model.queue.QueueScoreRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueueScoreRecordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    long countByExample(QueueScoreRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    int deleteByExample(QueueScoreRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    int insert(QueueScoreRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    int insertSelective(QueueScoreRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    List<QueueScoreRecords> selectByExample(QueueScoreRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    QueueScoreRecords selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") QueueScoreRecords record, @Param("example") QueueScoreRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    int updateByExample(@Param("record") QueueScoreRecords record, @Param("example") QueueScoreRecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    int updateByPrimaryKeySelective(QueueScoreRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 12:52:52 CST 2018
     */
    int updateByPrimaryKey(QueueScoreRecords record);
}