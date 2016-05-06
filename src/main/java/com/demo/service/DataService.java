package com.demo.service;

import java.util.List;

import com.demo.model.TYs;
import com.demo.model.User;

public interface DataService {

	List<User> getallUsers();
	List<TYs> getallTYs();
	
}
