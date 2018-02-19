package com.mercy.model.queue;

import java.io.Serializable;
import java.util.Date;

public class QueueScoreRecords implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_score_records.id
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_score_records.user_id
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_score_records.score_records
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    private String scoreRecords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_score_records.gmt_create
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_score_records.gmt_update
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    private Date gmtUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_score_records.id
     *
     * @return the value of queue_score_records.id
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_score_records.id
     *
     * @param id the value for queue_score_records.id
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_score_records.user_id
     *
     * @return the value of queue_score_records.user_id
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_score_records.user_id
     *
     * @param userId the value for queue_score_records.user_id
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_score_records.score_records
     *
     * @return the value of queue_score_records.score_records
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public String getScoreRecords() {
        return scoreRecords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_score_records.score_records
     *
     * @param scoreRecords the value for queue_score_records.score_records
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public void setScoreRecords(String scoreRecords) {
        this.scoreRecords = scoreRecords == null ? null : scoreRecords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_score_records.gmt_create
     *
     * @return the value of queue_score_records.gmt_create
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_score_records.gmt_create
     *
     * @param gmtCreate the value for queue_score_records.gmt_create
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_score_records.gmt_update
     *
     * @return the value of queue_score_records.gmt_update
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_score_records.gmt_update
     *
     * @param gmtUpdate the value for queue_score_records.gmt_update
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_score_records
     *
     * @mbg.generated Mon Feb 19 17:06:57 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", scoreRecords=").append(scoreRecords);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtUpdate=").append(gmtUpdate);
        sb.append("]");
        return sb.toString();
    }
}