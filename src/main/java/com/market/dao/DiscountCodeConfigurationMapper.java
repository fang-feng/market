package com.market.dao;

import com.market.domain.DiscountCodeConfiguration;
import java.util.List;

public interface DiscountCodeConfigurationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int insert(DiscountCodeConfiguration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    DiscountCodeConfiguration selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    List<DiscountCodeConfiguration> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int updateByPrimaryKey(DiscountCodeConfiguration record);
}