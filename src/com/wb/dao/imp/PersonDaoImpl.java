package com.wb.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wb.bean.Person;
import com.wb.dao.PersonDao;




/**
 * @author wangbo
 *
 */
public class PersonDaoImpl implements PersonDao {
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
public void save(Person person) {
	// TODO Auto-generated method stub
	Transaction ts=getSession().beginTransaction();
	getSession().save(person);
	ts.commit();
}

@Override
public void delete(int id) {
	// TODO Auto-generated method stub
	
}

@Override
public Person find(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void modify(Person person) {
	// TODO Auto-generated method stub
	
}

@Override
public List<Person> findAll() {
	// TODO Auto-generated method stub
	return null;
}
//根据第几页获取，每页几行获取数据
public List getList(String page, String rows) {
  
 //当为缺省值的时候进行赋值
 int currentpage = Integer.parseInt((page == null || page == "0") ? "1": page);//第几页
 int pagesize = Integer.parseInt((rows == null || rows == "0") ? "10": rows);//每页多少行
  
 List list = this.sessionFactory.getCurrentSession().createQuery("from Person")
                .setFirstResult((currentpage - 1) * pagesize).setMaxResults(pagesize).list();

 return list;
}

//统计一共有多少数据
public int getTotal() throws Exception {
 return this.sessionFactory.getCurrentSession().find("from Person").size();
}



}
