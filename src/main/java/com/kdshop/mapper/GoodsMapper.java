package com.kdshop.mapper;

import com.kdshop.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    Goods selectByPrimaryKey(Integer id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Goods record);

    List<Goods> selectAllGoods();

    List<Goods> searchGoods(@Param("name") String name, @Param("describle") String describle, @Param("status") Byte status);

    List<Goods> selectByCatelogAndStatus(@Param("cid") Integer cid, @Param("status") Byte status);

    List<Goods> selectByCatelogOrderByPolishDate(Integer catelogId, Integer limit);

    List<Goods> selectGoodsOrderByDate(Integer limit);

    List<Goods> selectGoodsByCatelogStatus(@Param("catelogId") Integer catelogId);

    List<Goods> getGoodsByUserId(Integer user_id);

    List<Goods> selectPrimaryKey();

    int updateViewCountByPrimaryKey(@Param("id") Integer id, @Param("viewCount") Integer viewCount);

    List<Goods> selectGoodsByStatusOrderByViewcountLimit(@Param("status") Byte status, @Param("limit") Integer limit);

    int updatePolishTimeByPrimaryKey(@Param("id") Integer gid, @Param("polishTime") String polishTime);

    List<Goods> selectGoodsByStatusOrderByPolishTime(@Param("status") Byte status);

    int updateStatusByPrimaryKey(@Param("id") Integer gid, @Param("status") Byte status);

    int updateEndTimeByPrimaryKey(@Param("id") Integer gid, @Param("endTime") String endTime);

    int updateCommentNumByPrimaryKey(@Param("id") Integer gid, @Param("commentNum") Integer commentNum);

    List<Goods> searchGoodsByKeyWord(@Param("name") String name, @Param("describle") String describle);

    Goods searchGoodsByKeyWordAndPrimary(@Param("id") Integer id, @Param("name") String name, @Param("describle") String describle);
}