package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeClient {
	public static void main(String args[]) throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee.getDate());
	}
}
