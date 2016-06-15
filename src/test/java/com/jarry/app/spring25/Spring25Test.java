package com.jarry.app.spring25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jarry.app.spring25.service.PersonService;

public class Spring25Test {

	public static void main(String[] args) {
		AbstractApplicationContext  ctx = new ClassPathXmlApplicationContext("com/jarry/app/spring25/service/person.xml");
//		PersonService ps = (PersonService) ctx.getBean("personService", PersonService.class);
//		ps.save();
//		PersonService ps0 = (PersonService) ctx.getBean("personService", PersonService.class);
//		/***
//		 * 结果为true, 说明ps和ps0引用的是同一个对象。
//		 * 即: Sping管理的bean默认都是单例模式的。
//		 * 作用域默认为单实例(.singleton)
//		 */
//		System.out.println(ps == ps0);
//		
//		PersonService ps2 = (PersonService) ctx.getBean("personService2", PersonService.class);
//		ps2.save();
//		
//		PersonService ps3 = (PersonService) ctx.getBean("personService3", PersonService.class);
//		ps3.save();
		ctx.close(); //销毁spring容器,触发destroy-method
		
	}

}
