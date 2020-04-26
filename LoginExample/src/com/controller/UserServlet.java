package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService us=new UserService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("t1");
		String pass=request.getParameter("t2");
		String utype=request.getParameter("ut");
		String result=us.newUser(new UserBean(pass, uname, utype));
		request.setAttribute("Res", result);
		RequestDispatcher dis=request.getRequestDispatcher("NewUser.jsp");
		dis.forward(request, response);
	}

}
