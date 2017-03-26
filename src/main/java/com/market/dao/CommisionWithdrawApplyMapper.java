package com.market.dao;

import com.market.domain.CommisionWithdrawApply;
import java.util.List;

public interface CommisionWithdrawApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int insert(CommisionWithdrawApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    CommisionWithdrawApply selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    List<CommisionWithdrawApply> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int updateByPrimaryKey(CommisionWithdrawApply record);
}