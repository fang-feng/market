package com.market.dao;

import com.market.domain.ShoppingTicket;
import java.util.List;

public interface ShoppingTicketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_ticket
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int deleteByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_ticket
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int insert(ShoppingTicket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_ticket
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    ShoppingTicket selectByPrimaryKey(Object id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_ticket
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    List<ShoppingTicket> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_ticket
     *
     * @mbg.generated Thu Mar 23 23:09:31 CST 2017
     */
    int updateByPrimaryKey(ShoppingTicket record);
}