package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.config.MyConfigClass;
import com.aop.entity.Recharge;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Recharge recharge=appContext.getBean(Recharge.class);
		recharge.myRecharge();
//		recharge.rechargeProcessing();
//		recharge.rechargeCompletion();
	}
}
