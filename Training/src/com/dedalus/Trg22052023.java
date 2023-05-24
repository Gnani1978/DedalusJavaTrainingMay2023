package com.dedalus;

public class Trg22052023 {

	String disp3m= "Hi there!! i am class variable";
	
	public static void main(String[] args) {
		Trg22052023 trg = new Trg22052023();
		System.out.println("Calling display2 from main using first instance....");
		System.out.println("..............................");
		trg.display2();
		System.out.println("Calling display1 from main using first instance....");
		System.out.println("..............................");
		trg.display1();
		Trg22052023 trg2 = new Trg22052023();
		System.out.println("Calling display2 from main using second instance....");
		System.out.println("..............................");
		trg2.display2();
		System.out.println("Calling display1 from main using first instance....");
		System.out.println("..............................");
		trg2.display1();
		System.out.println(trg.disp3m + " called inside main");
	}
	public void display1()
	{
		int disp1 = 89;
		System.out.println("I am local variable from display1 :" +disp1);
		System.out.println(disp3m + " called inside display1");
		System.out.println(".......................................");
	}
	
	public void display2()
	{
		int disp2 = 98;
		Trg22052023 trg = new Trg22052023();
		System.out.println("Calling display1 from display2....");
		System.out.println("..............................");
		 trg.display1();
			System.out.println("Calling display1 from display2 without reference....");
			System.out.println("..............................");
		 display1();
		 System.out.println("I am local variable from display2 :" +disp2);
		 System.out.println(disp3m + " called inside display2");
		 System.out.println(".......................................");
	}

}
