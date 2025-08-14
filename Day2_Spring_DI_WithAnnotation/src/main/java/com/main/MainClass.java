package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.ConfigClass;
import com.entity.Country;
import com.entity.Employee;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee e = appContext.getBean(Employee.class);
		System.out.println(e);
		
		
	}
}
