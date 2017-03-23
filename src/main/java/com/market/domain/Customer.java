package com.market.domain;

import java.util.Date;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    private Object id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.name
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.user_id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    private Object userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.create_time
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.sales_id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    private Object salesId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.id
     *
     * @return the value of customer.id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public Object getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.id
     *
     * @param id the value for customer.id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.name
     *
     * @return the value of customer.name
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.name
     *
     * @param name the value for customer.name
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.user_id
     *
     * @return the value of customer.user_id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public Object getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.user_id
     *
     * @param userId the value for customer.user_id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.create_time
     *
     * @return the value of customer.create_time
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.create_time
     *
     * @param createTime the value for customer.create_time
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.sales_id
     *
     * @return the value of customer.sales_id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public Object getSalesId() {
        return salesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.sales_id
     *
     * @param salesId the value for customer.sales_id
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    public void setSalesId(Object salesId) {
        this.salesId = salesId;
    }
}