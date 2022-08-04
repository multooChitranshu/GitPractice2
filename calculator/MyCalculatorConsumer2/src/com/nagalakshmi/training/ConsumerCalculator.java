package com.nagalakshmi.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nagalakshmi.demo.Operator;

public class ConsumerCalculator{
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("MyCalculatorConfig.xml");
		
		
		Operator addition = (Operator)applicationContext.getBean("adding");
		Operator subtraction = (Operator)applicationContext.getBean("sub");

		Operator division = (Operator)applicationContext.getBean("div");

		Operator multiplication = (Operator)applicationContext.getBean("multiply");

		
		System.out.println(addition.perform());
		System.out.println(subtraction.perform());
		System.out.println(multiplication.perform());
		System.out.println(division.perform());
	}

}
