package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.model.UserExample;
import com.demo.service.UserService;
import com.demo.dao.UserMapper;
 
 
@Service
public class UserServiceImpl implements UserService{
 
/*	
    @Autowired
    @Qualifier("userDAO")
    private UserDAO userDAO;
*/
	
    @Autowired
    private UserMapper userMapper;
	
    public List<User> getallUser() {
        // TODO Auto-generated method stub
        return userMapper.selectByExample(new UserExample());
    }
 
}