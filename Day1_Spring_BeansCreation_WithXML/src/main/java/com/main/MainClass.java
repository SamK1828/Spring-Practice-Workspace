package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("springbeans.xml");
		Employee e1 =appContext.getBean("emp1",Employee.class);
//		Employee e2 =appContext.getBean("emp2",Employee.class);
//		Employee e3 =appContext.getBean("emp3",Employee.class);
		
//		e.setEmp_id(121);
//		e.setEmp_name("Samarth");
//		e.setSalary("15 LPA");
		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
		
		
	}
}
