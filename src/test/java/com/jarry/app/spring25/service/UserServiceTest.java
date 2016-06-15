package com.jarry.app.spring25.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jarry.app.spring25.model.User;
import com.jarry.app.spring25.service.impl.UserServiceImpl;

public class UserServiceTest {
	
	private ApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("com/jarry/app/spring25/service/user.xml");
	}

	@Test
	public void testAddUser() {
		UserServiceImpl userService = (UserServiceImpl) ctx.getBean("userService");
		System.out.println(userService.getId());
		System.out.println(userService.getName());
		userService.addUser(new User("jarry", 28));
	}

}
