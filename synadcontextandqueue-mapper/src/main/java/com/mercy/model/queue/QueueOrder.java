package com.mercy.model.queue;

import java.io.Serializable;
import java.util.Date;

public class QueueOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.id
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.order_no
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private String orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.origin
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private String origin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.dest
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private String dest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.customer_name
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private String customerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.customer_code
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private String customerCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.remark
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.gmt_create
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.gmt_update
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private Date gmtUpdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column queue_order.user_status
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private String userStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table queue_order
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.id
     *
     * @return the value of queue_order.id
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.id
     *
     * @param id the value for queue_order.id
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.order_no
     *
     * @return the value of queue_order.order_no
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.order_no
     *
     * @param orderNo the value for queue_order.order_no
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.origin
     *
     * @return the value of queue_order.origin
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.origin
     *
     * @param origin the value for queue_order.origin
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.dest
     *
     * @return the value of queue_order.dest
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public String getDest() {
        return dest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.dest
     *
     * @param dest the value for queue_order.dest
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setDest(String dest) {
        this.dest = dest == null ? null : dest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.customer_name
     *
     * @return the value of queue_order.customer_name
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.customer_name
     *
     * @param customerName the value for queue_order.customer_name
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.customer_code
     *
     * @return the value of queue_order.customer_code
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.customer_code
     *
     * @param customerCode the value for queue_order.customer_code
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.remark
     *
     * @return the value of queue_order.remark
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.remark
     *
     * @param remark the value for queue_order.remark
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.gmt_create
     *
     * @return the value of queue_order.gmt_create
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.gmt_create
     *
     * @param gmtCreate the value for queue_order.gmt_create
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.gmt_update
     *
     * @return the value of queue_order.gmt_update
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.gmt_update
     *
     * @param gmtUpdate the value for queue_order.gmt_update
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column queue_order.user_status
     *
     * @return the value of queue_order.user_status
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column queue_order.user_status
     *
     * @param userStatus the value for queue_order.user_status
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table queue_order
     *
     * @mbg.generated Fri Mar 02 14:16:17 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", origin=").append(origin);
        sb.append(", dest=").append(dest);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerCode=").append(customerCode);
        sb.append(", remark=").append(remark);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtUpdate=").append(gmtUpdate);
        sb.append(", userStatus=").append(userStatus);
        sb.append("]");
        return sb.toString();
    }
}