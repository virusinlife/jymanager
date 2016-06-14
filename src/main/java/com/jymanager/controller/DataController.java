package com.jymanager.controller;

import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jymanager.auth.Auth;
import com.jymanager.model.TYs;
import com.jymanager.model.User;
import com.jymanager.service.DataService;



 
@Controller
public class DataController {
 
	@Autowired
	private DataService dataService;

    @RequestMapping(value = "getAllUsers.do")  
	public @ResponseBody List<User>  getAllUsers() throws Exception{
		//获取当前页的用户列表的数据
 		List<User> list = dataService.getAllUsers();
		return list;
	}      

    @RequestMapping(value = "getAllTYs.do")  
	public @ResponseBody List<TYs>  getAllYSs() throws Exception{
		//获取当前页的用户列表的数据
 		List<TYs> list = dataService.getAllYSs();
		return list;
	}         

    @RequestMapping(value = "getTYsByID.do")  
	public @ResponseBody List<TYs>  getYSsByID(String ID) throws Exception{
		//获取当前页的用户列表的数据
 		List<TYs> list = dataService.getAllYSsByID(ID);
		return list;
	}   
    
    @RequestMapping(value = "checkTYsByID.do")  
	public @ResponseBody int  checkTYsByID(String ID) throws Exception{
		//获取当前页的用户列表的数据
 		int count = dataService.checkTYsByID(ID);
		return count;
	}   
    
    @RequestMapping(value = "insertTYs.do")  
	public @ResponseBody int  insertTYs(TYs item) throws Exception{
		//获取当前页的用户列表的数据
    	item.setItem_input_datetime(new Date());    	
    	item.setItem_input_user("admin");
 		int count = dataService.insertTYs(item);
		return count;
	}   
    
    @Auth
	@RequestMapping(value = "updateTYsByID.do")  
	public @ResponseBody int  updateTYsByID(TYs item) throws Exception{
		//获取当前页的用户列表的数据
    	item.setItem_input_datetime(new Date());    
    	item.setItem_input_user("admin");
    	int count = dataService.updateTYsByPrimaryKey(item);
		return count;
	}   
    
    
    @Auth
	@RequestMapping(value = "deleteTYsByID.do")  
	public @ResponseBody int  deleteTYsByID(String ID) throws Exception{
		//获取当前页的用户列表的数据
    	int count = dataService.deleteByPrimaryKey(ID);
		return count;
	}   
    
    @Auth
    @RequestMapping(value = "searchTYs.do")  
	public @ResponseBody List<TYs>  searchTYs(TYs item) throws Exception{
		//获取当前页的用户列表的数据

  		List<TYs> list = dataService.searchTYs(item);
		return list;
	}    
    
    
    @Auth
    @RequestMapping(value = "exportTYs.do")  
	//public void  exportTYs(String[] columns,  TYs[] datas, HttpServletResponse res) throws Exception{
    public void  exportTYs(TYs item , HttpServletResponse res) throws Exception{
   	
    	byte[] buf = dataService.getByteArrayOfTYs("t_ys", item);
        
        OutputStream os = res.getOutputStream();  
        try {  
            res.reset();  
            res.setHeader("Content-Disposition", "attachment; filename=export.xlsx");  
            res.setContentType("application/octet-stream; charset=utf-8");  
            os.write(buf);  
            os.flush();  
        } finally {  
            if (os != null) {  
                os.close();  
            }  
        }  
	}    
   
    
}