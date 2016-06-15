package com.jarry.app.spring25.service.impl;

import com.jarry.app.spring25.dao.UserDao;
import com.jarry.app.spring25.model.User;
import com.jarry.app.spring25.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	private String name;
	private int id;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User u) {
		userDao.add(u);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
