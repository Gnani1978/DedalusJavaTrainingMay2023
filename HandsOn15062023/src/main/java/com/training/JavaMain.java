package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaMain {
	public static void main (String[] args ) 
	{
		ApplicationContext AC = new ClassPathXmlApplicationContext("Car.xml");
		User usr = (User) AC.getBean("user");
		System.out.println(usr.toString() + usr.getCar().toString());

		ApplicationContext AC2 = new ClassPathXmlApplicationContext("Car2.xml");
		User usr2 = (User) AC2.getBean("usr2");
		System.out.println("Spring handles datatypes automatically lol..................");
		System.out.println(usr2.toString() + usr2.getCar2().toString());
}
}
