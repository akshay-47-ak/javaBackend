package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       
        Student student = (Student) context.getBean("std1");
        
        System.out.println(student);
    }
}
