package com.market.dao;

import com.market.domain.Administrator;
import java.util.List;

public interface AdministratorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int insert(Administrator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    Administrator selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    List<Administrator> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrator
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int updateByPrimaryKey(Administrator record);
}