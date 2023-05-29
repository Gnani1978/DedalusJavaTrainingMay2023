package com.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordCheck {
	

	public static void main(String[] args) throws IOException, InterruptedException
	{
		String Loginname;
		String Password;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Login Name :-");
		Loginname = br.readLine();
		System.out.println("Enter Password :-");
		Password = br.readLine();
		System.out.println("Processing...........");
		Thread.sleep(3000);
		System.out.println("Login successful....Happy browsing....");
	}

}

