package com.entity;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim {

	@Override
	public String Calling() {
		
		
		return "U Are Calling From Airtel";
	}

}
