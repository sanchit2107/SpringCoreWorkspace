package foo;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	@Value("${eid}")
	private String empid;
	@Value("${name}")
	private String name;
	
	@Autowired
	private Address address;
		
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmpid() {
		return empid;
	}	
	public String getName() {
		return name;
	}	
	public Address getAddress() {
		return address;
	}
	
	public void printEmployee() {
		System.out.println("EmplID:"+empid);
		System.out.println("Name:"+name);
		System.out.println("City:"+address.getCity());
		System.out.println("Country:"+ address.getCountry());
	}
	@PostConstruct
	public void aaaaa() {
		System.out.println("Employee Created!!!!  at "+new Date());
	}
	@PreDestroy
	public void bbbb() {
		System.out.println("Bean Destroyed!!!!!");
	}
}
