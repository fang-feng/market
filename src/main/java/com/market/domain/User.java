package com.market.domain;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.wechat_id
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    private String wechatId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.wechat_unionid
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    private String wechatUnionid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.wechat_id
     *
     * @return the value of user.wechat_id
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    public String getWechatId() {
        return wechatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.wechat_id
     *
     * @param wechatId the value for user.wechat_id
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.wechat_unionid
     *
     * @return the value of user.wechat_unionid
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    public String getWechatUnionid() {
        return wechatUnionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.wechat_unionid
     *
     * @param wechatUnionid the value for user.wechat_unionid
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    public void setWechatUnionid(String wechatUnionid) {
        this.wechatUnionid = wechatUnionid;
    }
}