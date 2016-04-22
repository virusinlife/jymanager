package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.TYs;
import com.demo.model.TYsExample;
import com.demo.model.User;
import com.demo.model.UserExample;
import com.demo.service.DataService;
import com.demo.dao.TYsMapper;
import com.demo.dao.UserMapper;
 
 
@Service
public class DataServiceImpl implements DataService{
 
	
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private TYsMapper tysMapper;
	
    public List<User> getallUsers() {
        // TODO Auto-generated method stub
        return userMapper.selectByExample(new UserExample());
    }
 
    public List<TYs> getallTYs() {
        // TODO Auto-generated method stub
        return tysMapper.selectByExample(new TYsExample());
    }

}