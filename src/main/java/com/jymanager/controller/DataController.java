package com.jymanager.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jymanager.auth.Auth;
import com.jymanager.model.TYs;
import com.jymanager.model.User;
import com.jymanager.service.DataService;
import com.jymanager.utils.ReadWriteExcel;



 
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
    public void  exportTYs(TYs item, HttpServletResponse res) throws Exception{
    	// 清空response  
    	res.reset();  
        try {  
        	String[][] buf = dataService.getDataArrayOfTYs("t_ys", item);
        	res.setContentType("application/vnd.ms-excel");  
        	res.setHeader("content-disposition", "attachment;filename=export.xls");  

        	OutputStream os = res.getOutputStream();
        	ReadWriteExcel.Data2XLSStream(buf, os);
            
            os.flush();
            os.close();
        } catch (IOException ex) {  
            ex.printStackTrace();  
        }  
//        
        
        return;

	}    
   
    
}