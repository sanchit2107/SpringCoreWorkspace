package main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.Department;

import cfg.JavaConfig;

public class DepMain {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		Department d=(Department)ctx.getBean("dept");
		d.printDepartment();

	}

}
