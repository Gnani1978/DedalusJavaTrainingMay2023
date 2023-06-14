package com.training.FactoryPattern;

interface FactoryFloow 
	{
	
		void LiftIn();
	}
	class Floor1 implements FactoryFloow
	{
		public void LiftIn()
		{
			System.out.println("First Floor!!!");
		}
	}
	class Floor2 implements FactoryFloow
	{
		public void LiftIn()
		{
			System.out.println("Second Floor!!!");
		}
	}
