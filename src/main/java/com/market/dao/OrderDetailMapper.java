package com.market.dao;

import com.market.domain.OrderDetail;
import java.util.List;

public interface OrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int insert(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    OrderDetail selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    List<OrderDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int updateByPrimaryKey(OrderDetail record);
}