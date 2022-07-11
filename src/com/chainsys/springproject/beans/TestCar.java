package com.chainsys.springproject.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void firstTest() {
		
			ApplicationContext ac = new ClassPathXmlApplicationContext("Car.xml");
			Car c = ac.getBean(Car.class);
//			c.start();
//			c.rotate();
		
	    
	}
}
