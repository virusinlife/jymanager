package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.TableColumns;
import com.demo.model.TableColumnsExample;
import com.demo.model.TableColumnsExample.Criteria;
import com.demo.service.TableColumnsService;
import com.demo.dao.TableColumnsMapper;
 
 
@Service
public class TableColumnsServiceImpl implements TableColumnsService{
 

    @Autowired
    private TableColumnsMapper tableColumnsMapper;
	
    public List<TableColumns> getTableColumnsByTableName(String tablename) {
        // TODO Auto-generated method stub
    	TableColumnsExample exp = new TableColumnsExample();
    	
    	Criteria cri = exp.createCriteria();
    	
    	cri.andTableNameEqualTo(tablename);
    	cri.andTableSchemaEqualTo("jymanager");
    	  	
    	
        return tableColumnsMapper.selectByExample(exp);
    }
 
}