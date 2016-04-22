package com.demo.dao;

import com.demo.model.TYs;
import com.demo.model.TYsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TYsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int countByExample(TYsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int deleteByExample(TYsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int insert(TYs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int insertSelective(TYs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    List<TYs> selectByExample(TYsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    TYs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") TYs record, @Param("example") TYsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int updateByExample(@Param("record") TYs record, @Param("example") TYsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(TYs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ys
     *
     * @mbggenerated Thu Apr 21 19:02:34 GMT+08:00 2016
     */
    int updateByPrimaryKey(TYs record);
}