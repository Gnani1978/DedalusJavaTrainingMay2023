//Constructor overloading 
// inheritance (has a relation(reference within class-Salary sal) , in relation (extends Employee))
//method overridings (getdetails)

package com.training.Salary;


class Employee {

	int empno;
	String ename = "Asha";

	Salary sal;
	
	public Employee() {
	  System.out.println("From Employee Constructor");
	}
	
	public Employee(int x) {
		  this("Mani");
		  this.empno=x;
		  System.out.println("From Employee Constructor" + x);
	}
	
	public Employee(String str) {
		  
		  System.out.println("From Employee Constructor" + str);
	}
	public String getDetails() {
		return (empno + " -- " + ename + " --- " + sal);
	}

}

class Manager extends Employee {
	String dept = "IT";
	

	public Manager() {
		super(888);  // used to invoke base class constructor
		System.out.println("From Mgr Constr");
		
	}
	public String getDetails() {
		 return super.getDetails()+ "--  " + dept;
	}

}

public class mainC {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.getDetails());

		Manager mgr = new Manager();
		System.out.println(mgr.getDetails());
		
		emp.sal = new Salary(10000);	
		System.out.println(emp.sal);

	}

}