package com.wb.dao.imp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wb.bean.User;
import com.wb.dao.UserDao;


/**
 * @author wangbo
 *
 */
public class UserDaoImpl implements UserDao {
   private SessionFactory sessionFactory ;

public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}

public Session getSession(){
	
	return sessionFactory.getCurrentSession();
}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		getSession().save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(User user) {
		// TODO Auto-generated method stub
		
	}


}
