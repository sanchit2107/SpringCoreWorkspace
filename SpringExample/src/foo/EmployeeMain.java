package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Employee emp=(Employee)ctx.getBean("emp");
		emp.printEmployee();
		
		
	}

}
