package com.jymanager.service;

import java.util.List;

import com.jymanager.model.TYs;
import com.jymanager.model.User;

public interface DataService {

	List<User> getAllUsers();
	
	
	List<TYs> getAllYSs();
	List<TYs> getAllYSsByID(String id);	
	List<TYs> getAllYSsByExample();	
	int  checkTYsByID(String ID);
    int insertTYs(TYs record);
    
    int updateTYsByPrimaryKey(TYs record);
	
    int deleteByPrimaryKey(String ID);
    
    List<TYs>  searchTYs(TYs record);
    
    String[][] getDataArrayOfTYs(String tablename, TYs record);
}
