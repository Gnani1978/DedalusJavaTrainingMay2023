package com.gstock.application;
import com.gstock.controller.*;
import java.util.Scanner;

public class Applicationmain {
	public static void main(String[] args)
	{
		String ch=null;
		Controller c = new Controller();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter switch");
			int chc = sc.nextInt();
			switch(chc)
			{
			case 1:
			c.addStrategy();
			break;
			case 2:
			c.viewStrategy();
			break;
			default:
			break;
			
			}
			System.out.println("Continue????");
			ch = sc.next();
		}while (ch.equals("y"));
		System.out.println("Exited successfully");
		System.exit(0);
	}

}
