package com.bean;

public class UserBean {
	private String userId;
	private String password;
	private String userName;
	private String userType;
	public UserBean() {}
	public UserBean(String password, String userName, String userType) {
		super();
		this.password = password;
		this.userName = userName;
		this.userType = userType;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	

}
