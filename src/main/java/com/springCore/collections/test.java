package com.springCore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		emp1 emp=(emp1) context.getBean("emp1");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
		
		
	}
	
}
