package com.market.dao;

import com.market.domain.CommisionWithdrawApply;
import java.util.List;

public interface CommisionWithdrawApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int insert(CommisionWithdrawApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    CommisionWithdrawApply selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    List<CommisionWithdrawApply> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_withdraw_apply
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int updateByPrimaryKey(CommisionWithdrawApply record);
}