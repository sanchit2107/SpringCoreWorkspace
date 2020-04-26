package com.service;

import com.bean.UserBean;
import com.dao.UserDao;

public class UserService {
	UserDao ud=new UserDao();
	public String newUser(UserBean ubean) {
		if(ubean.getUserName().length()<=3 || ubean.getPassword().length()<8) {
			return "Invalid User Data";
		}
		else
		{
			Double d=Math.random();
			String uid=ubean.getUserName().substring(0,3)+d.toString().substring(2,7);
			ubean.setUserId(uid);
			return ud.createUser(ubean);
		}
	}
	public UserBean validateLogin(String uid, String pass) {
		if(uid.length()<7 || pass.length()<8) {
			return null;
		}
		else
			return ud.validateUser(uid, pass);
	}
}
