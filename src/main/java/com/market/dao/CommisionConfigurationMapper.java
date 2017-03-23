package com.market.dao;

import com.market.domain.CommisionConfiguration;
import java.util.List;

public interface CommisionConfigurationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_configuration
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_configuration
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int insert(CommisionConfiguration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_configuration
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    CommisionConfiguration selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_configuration
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    List<CommisionConfiguration> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commision_configuration
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int updateByPrimaryKey(CommisionConfiguration record);
}