package com.market.dao;

import com.market.domain.OrderInfluence;
import java.util.List;

public interface OrderInfluenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_influence
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_influence
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int insert(OrderInfluence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_influence
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    OrderInfluence selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_influence
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    List<OrderInfluence> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_influence
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int updateByPrimaryKey(OrderInfluence record);
}