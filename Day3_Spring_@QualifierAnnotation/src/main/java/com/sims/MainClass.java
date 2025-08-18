package com.sims;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext appContext= new AnnotationConfigApplicationContext(MyConfig.class);
		User user= appContext.getBean(User.class);
		System.out.println(user.getSim1().calling());
		System.out.println(user.getSim2().calling());
	}
}
