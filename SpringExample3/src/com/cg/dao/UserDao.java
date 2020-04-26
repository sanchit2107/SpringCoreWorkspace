package com.cg.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

public interface UserDao {
	public String addUser(String uname, String pass);
	public String removeUser(String uname);
	public String getPassword(String uname);
	public Map<String,String> allUsers();
}
