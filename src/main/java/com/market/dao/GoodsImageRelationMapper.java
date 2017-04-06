package com.market.dao;

import com.market.domain.GoodsImageRelation;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodsImageRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image_relation
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image_relation
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int insert(GoodsImageRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image_relation
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    GoodsImageRelation selectByPrimaryKey(String id);
    
    GoodsImageRelation selectByGoodsId(@Param("goods_id")String goods_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image_relation
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    List<GoodsImageRelation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image_relation
     *
     * @mbg.generated Mon Mar 27 01:56:44 CST 2017
     */
    int updateByPrimaryKey(GoodsImageRelation record);
}