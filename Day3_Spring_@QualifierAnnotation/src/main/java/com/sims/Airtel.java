package com.sims;

import org.springframework.stereotype.Component;

@Component("air")
public class Airtel implements Sim{

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return "Call From Airtel Sim";
	}

}
