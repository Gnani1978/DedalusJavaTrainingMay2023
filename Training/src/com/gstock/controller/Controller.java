package com.gstock.controller;
import com.gstock.strategy.Strategies;
import java.util.Scanner;

public class Controller 
{

	Scanner sc = new Scanner(System.in);
	Strategies s = new Strategies();
	
	public void addStrategy()
	{
		System.out.println("Enter strategy name") ;
		String straname = sc.next();
		s.setSname(s.getSname() + "|" + straname);
	}
	public void viewStrategy() {
		System.out.println("Entered Name is : " + s.getSname());
		System.out.println("Object detail is : " + s);
		
	}
}

