package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		//Calling Spring IOC
		//BeanFactory bf=new XmlBeanFactory(new ClassPathResource("Bean.xml"));
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");		
		HelloWorld hello=(HelloWorld)ctx.getBean("h");
		HelloWorld hello1=(HelloWorld)ctx.getBean("h");
		
		System.out.println(hello);
		System.out.println(hello1);
		
		System.out.println(hello.message);
		System.out.println(hello1.message);
		
		hello.message="Hello Ramesh!";
		
		System.out.println(hello.message);
		System.out.println(hello1.message);
	}
}
