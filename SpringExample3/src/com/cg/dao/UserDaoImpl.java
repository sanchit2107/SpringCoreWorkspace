package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	static Map<String, String> users=new HashMap<String, String>();
	public UserDaoImpl() {
		users.put("Prashant", "abcd");
		users.put("Saurabh", "xyz");
		users.put("Amit", "abde");
	}
	@Override
	public String addUser(String uname, String pass) {
		users.put(uname, pass);
		return "User Created! "+uname;
	}

	@Override
	public String removeUser(String uname) {
		users.remove(uname);
		return "User Removed";
	}

	@Override
	public String getPassword(String uname) {
		if(users.containsKey(uname))
			return users.get(uname);
		else
			return null;
	}
	@Override
	public Map<String, String> allUsers() {
		return users;
	}

}
