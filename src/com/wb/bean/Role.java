package com.wb.bean;

import java.util.HashSet;
import java.util.Set;

public class Role {
private int id;
private String name;
private String description;
private Set<User> users=new HashSet<User>();
public Set<User> getUsers() {
	return users;
}
public void setUsers(Set<User> users) {
	this.users = users;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
