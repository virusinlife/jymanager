package com.jymanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jymanager.model.TYs;
import com.jymanager.model.TYsExample;
import com.jymanager.model.User;
import com.jymanager.model.UserExample;
import com.jymanager.service.DataService;
import com.jymanager.dao.TYsMapper;
import com.jymanager.dao.UserMapper;
 
 
@Service
public class DataServiceImpl implements DataService{
 
	
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private TYsMapper tysMapper;
	
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
}