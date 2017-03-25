package com.market.dao;

import com.market.domain.DiscountCodeConfigurationDetail;
import java.util.List;

public interface DiscountCodeConfigurationDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Sat Mar 25 20:29:44 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Sat Mar 25 20:29:44 CST 2017
     */
    int insert(DiscountCodeConfigurationDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Sat Mar 25 20:29:44 CST 2017
     */
    DiscountCodeConfigurationDetail selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Sat Mar 25 20:29:44 CST 2017
     */
    List<DiscountCodeConfigurationDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table discount_code_configuration_detail
     *
     * @mbg.generated Sat Mar 25 20:29:44 CST 2017
     */
    int updateByPrimaryKey(DiscountCodeConfigurationDetail record);
}