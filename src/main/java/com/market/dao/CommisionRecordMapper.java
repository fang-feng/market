package com.market.dao;

import com.market.domain.CommisionRecord;
import java.util.List;

public interface CommisionRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_record
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_record
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int insert(CommisionRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_record
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    CommisionRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_record
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    List<CommisionRecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_record
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int updateByPrimaryKey(CommisionRecord record);
}