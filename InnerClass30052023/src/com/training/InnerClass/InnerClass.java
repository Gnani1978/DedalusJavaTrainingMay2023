package com.training.InnerClass;

public class InnerClass {
	
	static abstract class IamInner
	{
		int i = 30;
		public void DontCheckAbstract()
		{
			System.out.println("Normal method in Abstract inner class with instance variable value :" + i);
		}
		
		public abstract void CheckAbstract();
	}

	public static void main(String[] args) {
		
		System.out.println("Training inner class - Inner class can be an abstract");
		ExtendClass ex = new ExtendClass();
		ex.DontCheckAbstract();
		ex.CheckAbstract();

	}

}

class ExtendClass extends InnerClass.IamInner
{
	public void CheckAbstract()
	{
		i = 25;
		System.out.println("Normal method in class extended using inner class. If inner class is declared static , inner class can be inherited");
		System.out.println("Inner class variable accessible in inherited class : " + i);
	}
}

// 