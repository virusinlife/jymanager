package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.TYs;
import com.demo.model.User;
import com.demo.service.DataService;
 
@Controller
public class DataController {
 
	@Autowired
	private DataService dataService;

    @RequestMapping(value = "getAllUsers.do")  
	public @ResponseBody List<User>  selectUsersByExample() throws Exception{
		//获取当前页的用户列表的数据
 		List<User> list = dataService.getallUsers();
		return list;
	}      

    @RequestMapping(value = "getAllTYs.do")  
	public @ResponseBody List<TYs>  selectTYsByExample() throws Exception{
		//获取当前页的用户列表的数据
 		List<TYs> list = dataService.getallTYs();
		return list;
	}         
    
}