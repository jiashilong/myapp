package com.jarry.app.spring25.service.factory;

import com.jarry.app.spring25.service.PersonService;
import com.jarry.app.spring25.service.impl.PersonServiceImpl;

public class PersonServiceFactory {

	public static PersonService getInstance() {
		return new PersonServiceImpl();
	}
	
	public PersonService getPersonService() {
		return new PersonServiceImpl();
	}
}
