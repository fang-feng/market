package com.market.dao;

import com.market.domain.DiscountCodeConfiguration;
import java.util.List;

public interface DiscountCodeConfigurationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int insert(DiscountCodeConfiguration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    DiscountCodeConfiguration selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    List<DiscountCodeConfiguration> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int updateByPrimaryKey(DiscountCodeConfiguration record);
}