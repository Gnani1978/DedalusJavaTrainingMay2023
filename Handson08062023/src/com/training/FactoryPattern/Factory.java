package com.training.FactoryPattern;

	class FactoryF 
	{
		public FactoryFloow getFloor(String str)
		{
			if(str==null)
				return null;
			if(str.equals("1"))
				return new Floor1();
			else if(str.equals("2"))
				return new Floor2();
			return null;
		}
	}


	class Factory
	{
		public static void main(String args[])
		{
			
			FactoryF fac=new FactoryF();
			
			FactoryFloow f1=fac.getFloor("1");
			f1.LiftIn();
			   try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
			FactoryFloow f2= fac.getFloor("2");
			f2.LiftIn();

			
		}
	}

