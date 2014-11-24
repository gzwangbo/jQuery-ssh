package com.wb.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext-*.xml");
	@Test
	public void testSession(){
		SessionFactory session=(SessionFactory) ac.getBean("sessionFactory");
		
		System.out.println(session);
	}
	@Test
	public void testTransaction(){
		
		TestService testService=(TestService)ac.getBean("testService");
		testService.save();
		
	}

}
