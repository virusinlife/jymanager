package com.jymanager.service;

import java.util.List;

import com.jymanager.model.TYs;
import com.jymanager.model.User;

public interface DataService {

	List<User> getAllUsers();
	
	
	List<TYs> getAllYSs();
	List<TYs> getAllYSsByID(String id);	
	List<TYs> getAllYSsByExample();	
	
}
