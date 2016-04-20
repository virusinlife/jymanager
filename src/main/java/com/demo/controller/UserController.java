package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
import com.demo.service.UserService;
import com.demo.dao.UserMapper;
 
@Controller
public class UserController {
 
	@Autowired
	private UserService userService;
	
	
	private UserMapper usermapper;
	
    @RequestMapping(value="main.do")
    public ModelAndView main(User user){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("main");
        return mav;
    }
    
    
    @RequestMapping(value="ys_whf_frames.do")
    public ModelAndView ys_whf_frames(User user){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("ys_whf_frames");
        return mav;
    }   

    @RequestMapping(value = "selectByExample.do")  
	public @ResponseBody List<User>  selectByExample() throws Exception{
		//获取当前页的用户列表的数据
 		List<User> list = userService.getallUser();
		return list;
	}      
    

    @RequestMapping(value = "getAllParam.do")  
	public @ResponseBody List<User>  getallUser() throws Exception{
		//获取当前页的用户列表的数据
		List<User> list = userService.getallUser();
		return list;
	}  
    
}