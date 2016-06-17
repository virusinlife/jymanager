package com.jymanager.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jymanager.model.TYs;
import com.jymanager.model.TYsExample;
import com.jymanager.model.TableColumns;
import com.jymanager.model.TableColumnsExample;
import com.jymanager.model.TYsExample.Criteria;
import com.jymanager.model.User;
import com.jymanager.model.UserExample;
import com.jymanager.service.DataService;
import com.jymanager.dao.TYsMapper;
import com.jymanager.dao.TableColumnsMapper;
import com.jymanager.dao.UserMapper;
import java.lang.reflect.Field;  
 
@Service
public class DataServiceImpl implements DataService{
 
	
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private TYsMapper tysMapper;
    
    @Autowired
    private TableColumnsMapper tableColumnsMapper;
    
	
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        return userMapper.selectByExample(new UserExample());
    }
 
    public List<TYs> getAllYSs() {
        // TODO Auto-generated method stub
        return tysMapper.selectByExample(new TYsExample());
    }

    
    public List<TYs> getAllYSsByID(String id)
    {
    	TYsExample ex = new TYsExample();
    	ex.createCriteria().andYs_idEqualTo(id);    	
    	return tysMapper.selectByExample(ex);
    }
    public List<TYs> getAllYSsByExample()
    {
    	return tysMapper.selectByExample(new TYsExample());
    }
    
    public int checkTYsByID(String ID)
    {
    	TYsExample ex = new TYsExample();
    	ex.createCriteria().andYs_idEqualTo(ID);    	
    	return tysMapper.countByExample(ex);    	
    }
    
    public int insertTYs(TYs record)
    {
    	return tysMapper.insert(record);
    }
    
    public int updateTYsByPrimaryKey(TYs record)
    {
    	return tysMapper.updateByPrimaryKey(record);
    }
    
    public int deleteByPrimaryKey(String ID)
    {
    	return tysMapper.deleteByPrimaryKey(ID);
    }
    
    public  List<TYs>  searchTYs(TYs record)
    {
    	TYsExample ex = new TYsExample();
    	Criteria cr = ex.createCriteria();
    	cr.andYs_idLike("%"+record.getYs_id()+"%");    	
    	cr.andIsvalidLike("%"+record.getIsvalid()+"%"); 
    	cr.andItem_buy_wayLike("%"+record.getItem_buy_way()+"%"); 
    	cr.andItem_nameLike("%"+record.getItem_name()+"%"); 
    	cr.andItem_own_userLike("%"+record.getItem_own_user()+"%"); 
    	cr.andItem_typeLike("%"+record.getItem_type()+"%"); 
    	cr.andItem_yearLike("%"+record.getItem_year()+"%"); 
    	cr.andYs_nameLike("%"+record.getYs_name()+"%"); 
    	cr.andYs_subnameLike("%"+record.getYs_subname()+"%"); 
    	cr.andYs_typeLike("%"+record.getYs_type()+"%");     	
    	
    	return tysMapper.selectByExample(ex);
    }
    
    public byte[] getByteArrayOfTYs(String tablename, TYs record)
    {

   
    	TableColumnsExample exp = new TableColumnsExample();
    	TableColumnsExample.Criteria cri = exp.createCriteria();
    	cri.andTableNameEqualTo(tablename);
    	cri.andTableSchemaEqualTo("jymanager");
    	
    	List<TableColumns> cols = tableColumnsMapper.selectByExample(exp);
    	List<TYs> list = searchTYs(record);  	
    	
    	String[] columns=  new String[3];
    	int i = 0;
    	for(TableColumns tc : cols)
    	{
    		columns[i++]=tc.getTitle();
    	}
    	
    	int rowcount = list.size();
    	int colcount = cols.size();
    	String[][] datas = new String[rowcount][colcount];
    	
    	Class<TYs> cls = TYs.class;  
    	
        Field[] fields = cls.getDeclaredFields();  

    	
    	i=0;
    	for(TYs ys : list)
    	{
    		int j=0;
    		datas[i][j++]="";
            for(int i=0; i<fields.length; i++){  
                Field f = fields[i];  
                f.setAccessible(true);  
                System.out.println("属性名:" + f.getName() + " 属性值:" + f.get(ys));  
            }   
    		i++;
    	}   	
    	
    	return null;
    }
    
    
}