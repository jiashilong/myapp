package com.jarry.app.spring25.dao.impl;

import com.jarry.app.spring25.dao.UserDao;
import com.jarry.app.spring25.model.User;

public class UserDaoImpl implements UserDao {

	public void add(User u) {
		System.out.println("Add " + u);
	}

}
