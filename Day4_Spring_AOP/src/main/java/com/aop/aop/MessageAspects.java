package com.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspects {
//	@Before("execution(public void myRecharge())")
//	public void beforeRecharge() {
//		System.out.println("Message Before Recharge: Package Expiring Soon !!!!!");
//	}
//
	@After("execution(public void myRecharge())")
	public void afterRecharge() {
		System.out.println("Message After Recharge: Recharge Successfull !!!!!");
	}

	@Around("execution(public void myRecharge())")
	public void aroundMessage(ProceedingJoinPoint p) throws Throwable {
		System.out.println("Contacting Both Bank Server to Connect and Send the Payment and Approving the Request");
		p.proceed();
	}

}
