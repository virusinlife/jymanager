package com.demo.dao;

import com.demo.model.TableColumns;
import com.demo.model.TableColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableColumnsMapper {


    int countByExample(TableColumnsExample example);


    int deleteByExample(TableColumnsExample example);


    int deleteByPrimaryKey(String id);


    int insert(TableColumns record);


    int insertSelective(TableColumns record);


    List<TableColumns> selectByExample(TableColumnsExample example);


    TableColumns selectByPrimaryKey(String id);


    int updateByExampleSelective(@Param("record") TableColumns record, @Param("example") TableColumnsExample example);

 
    int updateByExample(@Param("record") TableColumns record, @Param("example") TableColumnsExample example);


    int updateByPrimaryKeySelective(TableColumns record);


    int updateByPrimaryKey(TableColumns record);
}