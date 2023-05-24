package com.dedalus;

 class Javawelcome {
		int j=8;
		public void display( )
		{
			System.out.println("gwelcome2");
			Javaexit jw = new Javaexit();
			System.out.println("gwelcome2: " + jw.j);
			jw.j = 9;
			System.out.println("gwelcome2: " + new Javaexit().j);
			System.out.println("gwelcome2: " + jw.j);
		}
}

public class Javaexit
{
	int j =11;
	public static void main(String[] args)
	{
		System.out.println("gwelcome");
		Javawelcome jw = new Javawelcome();
		System.out.println("gwelcome: " + jw.j);
		jw.j = 9;
		System.out.println("gwelcome: " + new Javawelcome().j);
		System.out.println("gwelcome: " + jw.j);
		jw.display();
	}
}