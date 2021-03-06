package com.market.dao;

import com.market.domain.GoodsProductRelation;
import java.util.List;

public interface GoodsProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_product_relation
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_product_relation
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int insert(GoodsProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_product_relation
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    GoodsProductRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_product_relation
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    List<GoodsProductRelation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_product_relation
     *
     * @mbg.generated Sat Mar 25 19:15:36 CST 2017
     */
    int updateByPrimaryKey(GoodsProductRelation record);
}