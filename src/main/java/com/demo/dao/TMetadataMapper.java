package com.demo.dao;

import com.demo.model.TMetadata;
import com.demo.model.TMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMetadataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int countByExample(TMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int deleteByExample(TMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int insert(TMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int insertSelective(TMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    List<TMetadata> selectByExample(TMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    TMetadata selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") TMetadata record, @Param("example") TMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int updateByExample(@Param("record") TMetadata record, @Param("example") TMetadataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(TMetadata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_metadata
     *
     * @mbggenerated Fri Apr 22 16:30:37 GMT+08:00 2016
     */
    int updateByPrimaryKey(TMetadata record);
}