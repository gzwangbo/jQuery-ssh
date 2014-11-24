package com.wb.service;

import java.util.List;

import com.wb.bean.Person;
import com.wb.dao.imp.PersonDaoImpl;

public class PersonService {
private PersonDaoImpl personDaoImpl;

public PersonDaoImpl getPersonDaoImpl() {
	return personDaoImpl;
}

public void setPersonDaoImpl(PersonDaoImpl personDaoImpl) {
	this.personDaoImpl = personDaoImpl;
}
public void save(Person person) {
	// TODO Auto-generated method stub
	personDaoImpl.save(person);
}


public void delete(int id) {
	// TODO Auto-generated method stub
	
}


public Person find(int id) {
	// TODO Auto-generated method stub
	return null;
}


public void modify(Person person) {
	// TODO Auto-generated method stub
	
}
//根据第几页获取，每页几行获取数据
public List getList(String page, String rows) {
  
 //当为缺省值的时候进行赋值
 
  
 List list = personDaoImpl.getList(page, rows);

 return list;
}

//统计一共有多少数据
public int getTotal() throws Exception {
 return personDaoImpl.getTotal();
}

}
