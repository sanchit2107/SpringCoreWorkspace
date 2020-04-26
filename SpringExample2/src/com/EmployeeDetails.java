package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("ed")
public class EmployeeDetails {
	List<String> names=new ArrayList<String>();
	private Map<String, Integer> m=new HashMap<String, Integer>();
	public EmployeeDetails() {
		names.add("Ravi");
		names.add("Ramesh");
		names.add("Sanchit");
		names.add("Riya");
		names.add("Urvashi");
		
		m.put("Ravi", 35000);
		m.put("Ramesh", 45000);
		m.put("Sanchit", 25000);
		m.put("Riya", 65000);
		m.put("Urvashi", 55000);
	}
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Map<String, Integer> getM() {
		return m;
	}
	public void setM(Map<String, Integer> m) {
		this.m = m;
	}
	
}
