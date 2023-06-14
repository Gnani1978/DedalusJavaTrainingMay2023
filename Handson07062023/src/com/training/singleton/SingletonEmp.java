package com.training.singleton;

public class SingletonEmp {
	
	private static SingletonEmp sE;
	
	String EName = "SingletonEMP";
	int ENo = 100000000;
	
	public static SingletonEmp getInstance()
	{
		if (sE == null)
			sE = new SingletonEmp();
		
		return sE;
	}
	
	public void getEmployee()
	{
		System.out.println("Name : " + EName + " | Eno : " + ENo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonEmp s = SingletonEmp.getInstance();
		s.getEmployee();

	}

}
