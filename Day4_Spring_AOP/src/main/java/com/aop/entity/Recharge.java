package com.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class Recharge {
	public void myRecharge() {
		System.out.println("Recharge Main Logic..");
	}

	public void rechargeCompletion() {
		System.out.println("Processing the Payment ......");
	}
	
	public void rechargeProcessing() {
		System.out.println("Please Wait While Processing Your Payment for Recharge Process");
	}
}
