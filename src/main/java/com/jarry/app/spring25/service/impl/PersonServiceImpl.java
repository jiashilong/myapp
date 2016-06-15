package com.jarry.app.spring25.service.impl;

import com.jarry.app.spring25.service.PersonService;


public class PersonServiceImpl implements PersonService {
	
	public PersonServiceImpl() {
		//init();
		System.err.println("PersonServiceImpl...");
	}
	
	public void init() {
		System.err.println("init");
	}
	
	public void destroy() {
		System.err.println("destroy");
	}
	
	public void save() {
		System.err.println("我是save()方法");
	}
}
