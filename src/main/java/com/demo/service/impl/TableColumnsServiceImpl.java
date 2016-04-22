package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.TMetadata;
import com.demo.model.TMetadataExample;
import com.demo.model.TableColumns;
import com.demo.model.TableColumnsExample;
import com.demo.service.TableColumnsService;
import com.demo.dao.TMetadataMapper;
import com.demo.dao.TableColumnsMapper;
 
 
@Service
public class TableColumnsServiceImpl implements TableColumnsService{
 

    @Autowired
    private TableColumnsMapper tableColumnsMapper;

    @Autowired
    private TMetadataMapper tMetadataMapper;
    
    public List<TableColumns> getTableColumnsByTableName(String tablename) {
        // TODO Auto-generated method stub
    	TableColumnsExample exp = new TableColumnsExample();
    	
    	TableColumnsExample.Criteria cri = exp.createCriteria();
    	
    	cri.andTableNameEqualTo(tablename);
    	cri.andTableSchemaEqualTo("jymanager");
    	
        return tableColumnsMapper.selectByExample(exp);
    }

	public List<TMetadata> getTableMetadatasByID(String id) {
		// TODO Auto-generated method stub
        // TODO Auto-generated method stub
		TMetadataExample exp = new TMetadataExample();
    	
		TMetadataExample.Criteria cri = exp.createCriteria();
    	
    	cri.andIdEqualTo(id);
    	
        return tMetadataMapper.selectByExample(exp);		
	}
 
}