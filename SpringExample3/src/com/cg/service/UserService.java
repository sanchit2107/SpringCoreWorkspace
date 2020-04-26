package com.cg.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDaoImpl;
	public String addUser(String uname, String pass) {
		if(uname.length()<3 || pass.length()<4)
			return "Invalid Data";
		else
			return userDaoImpl.addUser(uname, pass);
	}
	public String removeUser(String uname) {
		if(uname.length()>=3)
			return userDaoImpl.removeUser(uname);
		else
			return "Invalid User";
	}
	public Map<String, String> getAllUser() {
		return userDaoImpl.allUsers();
	}
}
