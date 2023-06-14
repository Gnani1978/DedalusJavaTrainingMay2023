package com.training.dbcon;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EmpInput {

	private transient Scanner sc = new Scanner(System.in);
	Employee emp;
	List<Employee> emplist = new ArrayList<Employee>();
	DBConnection empdao = new DBConnection();

	public void updateEmployee() {
		System.out.println("Enter employee number to update:");
		int eno = sc.nextInt();

		// Check if the employee exists in the list
		boolean employeeExists = false;
		for (Employee e : emplist) {
			if (e.getEmpno() == eno) {
				employeeExists = true;
				System.out.println("Enter new employee name:");
				String newName = sc.next();
				e.setEname(newName);
				EmpUpdate.updateEmployee(e);
				break;
			}
		}

		if (!employeeExists) {
			System.out.println("Employee with number " + eno + " does not exist.");
		}
		
	}
}
