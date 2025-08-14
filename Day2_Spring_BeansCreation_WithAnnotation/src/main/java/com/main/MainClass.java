package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.ConfigClass;
import com.entity.Country;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigClass.class);
		Country country1 = appContext.getBean(Country.class);
		Country country2 = appContext.getBean(Country.class);
		System.out.println(country1.hashCode());
		System.out.println(country2.hashCode());
		System.out.println(country1 == country2);
		
		
	}
}
