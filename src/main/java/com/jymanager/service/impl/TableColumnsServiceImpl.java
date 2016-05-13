package com.jymanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jymanager.model.TMetadata;
import com.jymanager.model.TMetadataExample;
import com.jymanager.model.TableColumns;
import com.jymanager.model.TableColumnsExample;
import com.jymanager.service.TableColumnsService;
import com.jymanager.dao.TMetadataMapper;
import com.jymanager.dao.TableColumnsMapper;
 
 
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