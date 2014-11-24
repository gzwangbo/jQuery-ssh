package com.wb.dao;

import com.wb.bean.User;


public interface UserDao  {
public void save(User user);
public void delete(int id);
public User find(int id);
public void modify(User user);




}
