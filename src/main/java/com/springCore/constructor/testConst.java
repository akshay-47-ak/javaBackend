package com.springCore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testConst {

 public static void main(String[] args) {
	
	 
ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/constructor/ciconfig.xml");	
	 
	   Person p = (Person) context.getBean("person");
	   
	  Addition a =(Addition) context.getBean("add");
	  
	a.add();
	 
}
	
	
}
