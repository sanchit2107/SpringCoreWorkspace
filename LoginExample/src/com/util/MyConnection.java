package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			System.out.println("Connected!!!!!!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return con;
	}

}
