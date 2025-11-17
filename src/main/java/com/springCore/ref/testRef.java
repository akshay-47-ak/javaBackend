package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testRef {
	
	
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ref/refConfig.xml");	
		
	    A a1=(A) context.getBean("refA");
	    
	     System.out.println(a1.getX());
		System.out.println(a1.getOb().getY());
	}

}
