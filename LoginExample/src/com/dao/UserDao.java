package com.dao;

import java.sql.Connection;

import com.bean.UserBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.MyConnection;

public class UserDao {
	Connection con=MyConnection.getConnection();
	public String createUser(UserBean uBean) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?)");
			ps.setString(1, uBean.getUserId());
			ps.setString(2, uBean.getPassword());
			ps.setString(3, uBean.getUserName());
			ps.setString(4, uBean.getUserType());
			int row=ps.executeUpdate();
			if(row>0)
				return "User Created! User ID: "+uBean.getUserId(); 
			else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public UserBean validateUser(String uid, String pass) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from User where userid=? and password=?");
			ps.setString(1, uid);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			UserBean ub=null;
			if(rs.next()) {
				ub=new UserBean();
				ub.setUserId(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setUserName(rs.getString(3));
				ub.setUserType(rs.getString(4));
				return ub;
			}
			else
				return ub;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
