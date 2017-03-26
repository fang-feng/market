package com.market.dao;

import com.market.domain.DiscountCodeConfigurationDetail;
import java.util.List;

public interface DiscountCodeConfigurationDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int insert(DiscountCodeConfigurationDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    DiscountCodeConfigurationDetail selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    List<DiscountCodeConfigurationDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int updateByPrimaryKey(DiscountCodeConfigurationDetail record);
}