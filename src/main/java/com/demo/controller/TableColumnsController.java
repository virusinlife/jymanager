package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.demo.model.TableColumns;
import com.demo.service.TableColumnsService;
 
@Controller
public class TableColumnsController {
 

	@Autowired
	private TableColumnsService tableColumnsService;


    
    @RequestMapping(value = "getTableColumnsByTableName.do" )  
	public @ResponseBody List<TableColumns> getTableColumnsByTableName(@RequestParam("tablename") String tablename) throws Exception{
		//获取当前页的用户列表的数据
		List<TableColumns> list = tableColumnsService.getTableColumnsByTableName(tablename);
		return list;
	}  
    
    
}