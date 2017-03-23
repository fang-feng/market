package com.market.dao;

import com.market.domain.PayRecord;
import java.util.List;

public interface PayRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int insert(PayRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    PayRecord selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    List<PayRecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int updateByPrimaryKey(PayRecord record);
}