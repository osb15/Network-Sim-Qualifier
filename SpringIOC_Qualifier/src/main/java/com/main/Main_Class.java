package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entity.MyConfiguration;
import com.entity.Person;

public class Main_Class {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Person p = context.getBean(Person.class);
		System.out.println(p.getSim1().Calling());
		System.out.println(p.getSim2().Calling());

	}

}
