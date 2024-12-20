package com.entity;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String Calling() {
		
		return "U Are Calling From Jio";
	}

}
