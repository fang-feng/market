package com.market.dao;

import com.market.domain.ShopAssistant;
import java.util.List;

public interface ShopAssistantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int insert(ShopAssistant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    ShopAssistant selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    List<ShopAssistant> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int updateByPrimaryKey(ShopAssistant record);
}