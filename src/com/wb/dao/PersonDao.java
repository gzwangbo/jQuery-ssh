package com.wb.dao;

import java.util.List;

import com.wb.bean.Person;




public interface PersonDao  {
public void save(Person person);
public void delete(int id);
public Person find(int id);
public void modify(Person person);
public List<Person> findAll();



}
