package com.market.dao;

import com.market.domain.shopAssistant;
import java.util.List;

public interface shopAssistantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int insert(shopAssistant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    shopAssistant selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    List<shopAssistant> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_assistant
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int updateByPrimaryKey(shopAssistant record);
}