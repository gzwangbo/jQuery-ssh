package com.wb.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wb.bean.User;

public class TestService {
	
 
private SessionFactory sessionFactory;
 public void save(){
	 Session session=sessionFactory.openSession();
	 Transaction transaction=session.beginTransaction();
	 session.save(new User());
	 
	 session.save(new User());
	 transaction.commit();
	 
	 
 }
public SessionFactory getSessionFactory() {
	return sessionFactory;
}
public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
 
 
}
